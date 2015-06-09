package com.amapolazul.www.traductorandriod.under_six.letters.letter_p;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.amapolazul.www.traductorandriod.R;
import com.amapolazul.www.traductorandriod.under_six.UnderSixActivity;

public class LetterPActivity extends Activity {

    private Dialog busyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_p);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_letter, menu);
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

    public void playFatherSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.father);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.padrelarge);

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

    public void playBirdSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.bird);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.pajarolarge);

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

    public void playBreadSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.bread);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.panlarge);

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

    public void playParkSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.park);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.parquelarge);

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

    public void playCakeSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.cake);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.pastellarge);
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

    public void playDuckSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.duck);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.patolarge);

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

    public void playHairSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.hair);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.pelolarge);

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

    public void playPearSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.pear);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.peralarge);

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

    public void playDogSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.dog);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.perrolarge);

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

    public void playPaperSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterPActivity.this, R.raw.paper);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.papellarge);

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

    public void returnToUnderSixPLetter(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(this, UnderSixActivity.class);
        startActivity(intent);
    }

    public void goToOtherWordsPLetter(View view) {
        Intent intent  = new Intent(this, LetterPActivityTwo.class);
        startActivity(intent);
    }
}
