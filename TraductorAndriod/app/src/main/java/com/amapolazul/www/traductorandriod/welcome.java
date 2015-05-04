package com.amapolazul.www.traductorandriod;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.amapolazul.www.traductorandriod.under_six.UnderSixActivity;
import com.amapolazul.www.traductorandriod.upper_six.UpperSixActivity;


public class welcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
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
     * Inicia la actividad que tiene el traductor para niños mayores de 6 años
     * @param view
     */
    public void goToUpperSix(View view) {
        Intent upperSixIntent = new Intent(this, UpperSixActivity.class);
        startActivity(upperSixIntent);
    }

    /**
     * Inicia la actividad que tiene el traductor para niños mayores de 6 años
     * @param view
     */
    public void goToUnderSix(View view) {
        Intent underSixIntent = new Intent(this, UnderSixActivity.class);
        startActivity(underSixIntent);
    }
}
