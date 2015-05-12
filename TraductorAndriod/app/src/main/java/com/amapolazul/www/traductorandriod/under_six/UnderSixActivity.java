package com.amapolazul.www.traductorandriod.under_six;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.amapolazul.www.traductorandriod.R;
import com.amapolazul.www.traductorandriod.under_six.letters.letter_b.LetterBActivity;
import com.amapolazul.www.traductorandriod.under_six.letters.letter_c.LetterCActivity;
import com.amapolazul.www.traductorandriod.under_six.letters.letter_d.LetterDActivity;
import com.amapolazul.www.traductorandriod.welcome;
import com.amapolazul.www.traductorandriod.under_six.letters.LetterAActivity;

public class UnderSixActivity extends Activity {

    private long timeSleep = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_six_activity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_under_six_activity, menu);
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

    public void goToLetterAActivity(View view) throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.a);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterBActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterBActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.b);
        Thread.sleep(timeSleep);
        mPlayer.start();
        startActivity(intent);
    }

    public void goToLetterCActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterCActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.c);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterDActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterDActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.d);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterEActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.e);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterFActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.f);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterGActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.g);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterHActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.h);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterIActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.i);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterJActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.j);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterKActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.k);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterLActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.l);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterMActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.m);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterNActivity(View view) throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.n);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterOActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.o);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterPActivity(View view)throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.p);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterQActivity(View view) throws InterruptedException {
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.q);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterRActivity(View view) throws InterruptedException {
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.r);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterSActivity(View view) throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.s);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterTActivity(View view) throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.t);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterUActivity(View view) throws InterruptedException {
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.u);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterVActivity(View view) throws InterruptedException {
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.v);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterWActivity(View view) throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.w);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterXActivity(View view) throws InterruptedException{
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.x);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterYActivity(View view) throws InterruptedException {
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.y);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    public void goToLetterZActivity(View view) throws InterruptedException {
        Intent intent  = new Intent(this, LetterAActivity.class);
        MediaPlayer mPlayer = MediaPlayer.create(UnderSixActivity.this, R.raw.z);
        mPlayer.start();
        Thread.sleep(timeSleep);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(this, welcome.class);
        startActivity(intent);
    }

    public void goInitPage(View view) {
        onBackPressed();
    }
}
