package com.amapolazul.www.traductorandriod.upper_six;

import android.app.Activity;
import android.content.Intent;
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
import com.amapolazul.www.traductorandriod.utils.Constants;
import com.amapolazul.www.traductorandriod.welcome;

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
        try{
            translatorWordsDAO.open();
            if(translatorWordsDAO.getAllWords().isEmpty()){
                TranslatorWordsInfo translatorWordsInfo = new TranslatorWordsInfo();
                translatorWordsInfo.setEnglish_audio_path("pathenglis");
                translatorWordsInfo.setEspanol_audio_path("pathSpa");
                translatorWordsInfo.setEnglish_def("HOUSE");
                translatorWordsInfo.setEspanol_def("CASA");
                translatorWordsDAO.createWordDefinition(translatorWordsInfo);
            }
        } catch (SQLException e) {
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
     * @param view
     */
    public void onRadioButtonClicked(View view) {
        System.out.println("Cambiando");
        ImageView englishRadio = (ImageView) findViewById(R.id.engSpaRadio);
        ImageView spanishRadio = (ImageView) findViewById(R.id.spaIngRadio);
        if(changeRadioStatusEnglish){
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
        TranslatorWordsInfo info = translatorWordsDAO.getWordInfo(wordToFind);
        String wordToShow = "";
        if(info != null) {
            if (translateType.equals(Constants.ESP_TRANS_TYPE)) {
                wordToShow = info.getEnglish_def();

            } else {
                wordToShow = info.getEspanol_def();
            }
        } else {
            wordToShow = Constants.WORD_NOT_FOUND;
        }

        Intent wordResult = new Intent(this, word_result.class);
        wordResult.putExtra(Constants.WORD_FOUND_URI, wordToShow);
        startActivity(wordResult);
    }

    public void backToMenu(View view) {
        Intent intent = new Intent(this, welcome.class);
        startActivity(intent);
    }
}
