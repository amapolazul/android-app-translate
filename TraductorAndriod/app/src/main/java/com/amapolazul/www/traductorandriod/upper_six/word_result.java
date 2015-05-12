package com.amapolazul.www.traductorandriod.upper_six;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.amapolazul.www.traductorandriod.R;
import com.amapolazul.www.traductorandriod.utils.Constants;
import com.amapolazul.www.traductorandriod.welcome;

public class word_result extends Activity {

    private String wordToShow;
    private String phonetic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_result);

        Intent intent = getIntent();
        wordToShow = intent.getStringExtra(Constants.WORD_FOUND_URI);
        phonetic = intent.getStringExtra(Constants.AUDIO_FOUND_URI);
        Typeface face = Typeface.createFromAsset(getAssets(),
                "pooh.ttf");

        TextView textView = (TextView) findViewById(R.id.wordResult);
        textView.setTypeface(face);
        TextView textViewPhonetic = (TextView) findViewById(R.id.phonetic);
        textViewPhonetic.setTypeface(face);
        textView.setText(wordToShow.replace(",", "\n"));
        textViewPhonetic.setText(phonetic);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_word_result, menu);
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

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, UpperSixActivity.class);
        startActivity(intent);
    }

    public void back(View view){
        onBackPressed();
    }
}
