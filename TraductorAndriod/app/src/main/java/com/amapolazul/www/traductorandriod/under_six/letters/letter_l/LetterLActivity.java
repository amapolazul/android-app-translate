package com.amapolazul.www.traductorandriod.under_six.letters.letter_l;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.amapolazul.www.traductorandriod.R;
import com.amapolazul.www.traductorandriod.under_six.UnderSixActivity;

public class LetterLActivity extends Activity {

    private Dialog busyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_l);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_letter_l, menu);
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

    public void playLizardSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.lizard);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lagartijalarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();

        mPlayer.start();
    }

    public void playLagoSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.lake);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lagolarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playLampSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.lamp);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lamparalarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playWoolSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.wool);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lanalarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playLobsterSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.lobster);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.langostalarge);
        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();

        mPlayer.start();
    }

    public void playPencilSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.pencil);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lapizlarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playCanSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.can);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.latalarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playMilkSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.milk);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lechelarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playLettuceSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.lettuce);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.lechugalarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void playLionSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterLActivity.this, R.raw.lion);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.leonlarge);

        ImageView dismisDialogImageView = (ImageView)busyDialog.findViewById(R.id.dismissDialog);
        dismisDialogImageView.setOnClickListener(new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                busyDialog.dismiss();
            }});

        busyDialog.show();
        mPlayer.start();
    }

    public void returnToUnderSixLLetter(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(this, UnderSixActivity.class);
        startActivity(intent);
    }

    public void goToOtherWordsLLetter(View view) {
        Intent intent  = new Intent(this, LetterLActivityTwo.class);
        startActivity(intent);
    }
}
