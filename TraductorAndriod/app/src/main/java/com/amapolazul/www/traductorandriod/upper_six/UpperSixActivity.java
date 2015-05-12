
package com.amapolazul.www.traductorandriod.upper_six;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.amapolazul.www.traductorandriod.R;
import com.amapolazul.www.traductorandriod.persistence.TranslatorWordsDAO;
import com.amapolazul.www.traductorandriod.persistence.TranslatorWordsInfo;
import com.amapolazul.www.traductorandriod.under_six.UnderSixActivity;
import com.amapolazul.www.traductorandriod.utils.Constants;
import com.amapolazul.www.traductorandriod.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class UpperSixActivity extends Activity {

    private String translateType;
    private TranslatorWordsDAO translatorWordsDAO;
    private boolean changeRadioStatusEnglish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_six);

        EditText input = (EditText) findViewById(R.id.inputPalabra);
        Typeface face = Typeface.createFromAsset(getAssets(),
                "pooh.ttf");

        changeRadioStatusEnglish = true;

        input.setTypeface(face);

        translateType = Constants.ESP_TRANS_TYPE;

        translatorWordsDAO = new TranslatorWordsDAO(this);

        AssetManager assetManager = this.getAssets();
        try {
            InputStream csvStream = assetManager.open("a.csv");
            InputStreamReader csvStreamReader = new InputStreamReader(csvStream);
            BufferedReader reader = new BufferedReader(csvStreamReader);
            translatorWordsDAO.open();
            //translatorWordsDAO.removeAll();
            String line;
            if(translatorWordsDAO.getWordEnglishSpanishInfo("a") == null) {
                while ((line = reader.readLine()) != null) {
                    String[] array = line.split(";");
                    System.out.println("agregando linea " + line);
                    TranslatorWordsInfo translatorWordsInfo = new TranslatorWordsInfo();
                    translatorWordsInfo.setEnglish_audio_path(array[2]);
                    translatorWordsInfo.setEspanol_audio_path("pathSpa");
                    translatorWordsInfo.setEnglish_def(array[0]);
                    translatorWordsInfo.setEspanol_def(array[1]);
                    translatorWordsDAO.createWordDefinition(translatorWordsInfo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_upper_six, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Verifica el tipo de traduccion a hacer. Si es español a ingles o ingles a español
     * modificando un string en la actividad dependiendo del checkbox seleccionado
     *
     * @param view
     */
    public void onRadioButtonClicked(View view) {
        System.out.println("Cambiando");
        ImageView englishRadio = (ImageView) findViewById(R.id.engSpaRadio);
        ImageView spanishRadio = (ImageView) findViewById(R.id.spaIngRadio);
        if (changeRadioStatusEnglish) {
            englishRadio.setImageResource(R.drawable.radio_active);
            spanishRadio.setImageResource(R.drawable.radio_normal);
            translateType = Constants.ENG_TRANS_TYPE;
            changeRadioStatusEnglish = false;
        } else {
            englishRadio.setImageResource(R.drawable.radio_normal);
            spanishRadio.setImageResource(R.drawable.radio_active);
            translateType = Constants.ESP_TRANS_TYPE;
            changeRadioStatusEnglish = true;
        }
    }

    public void search(View view) {
        System.out.print("Entrando al metodo");
        EditText textEdit = (EditText) findViewById(R.id.inputPalabra);
        String wordToFind = textEdit.getText().toString();
        String wordToShow = "";
        String phonetic = "";

        if (translateType.equals(Constants.ESP_TRANS_TYPE)) {
            TranslatorWordsInfo info = translatorWordsDAO.getWordSpanishEnglishInfo(wordToFind);
            if(info != null) {
                wordToShow = info.getEnglish_def();
                phonetic = info.getEnglish_audio_path();
            } else {
                wordToShow = Constants.WORD_NOT_FOUND;
            }

        } else {
            TranslatorWordsInfo info = translatorWordsDAO.getWordEnglishSpanishInfo(wordToFind);
            if(info != null) {
                wordToShow = info.getEspanol_def();
            } else {
                wordToShow = Constants.WORD_NOT_FOUND;
            }
        }

        Intent wordResult = new Intent(this, word_result.class);
        wordResult.putExtra(Constants.WORD_FOUND_URI, wordToShow);
        wordResult.putExtra(Constants.AUDIO_FOUND_URI, phonetic);
        startActivity(wordResult);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, welcome.class);
        startActivity(intent);
    }

    public void backToMenu(View view) {
        onBackPressed();
    }
}
