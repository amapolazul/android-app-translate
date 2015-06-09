package com.amapolazul.www.traductorandriod.under_six.letters.letter_q;

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

public class LetterQActivity extends Activity {

    private Dialog busyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_q);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_letter_q, menu);
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

    public void playRavineSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.ravine);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quebradalarge);

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

    public void playBreakSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.breakk);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quebrarlarge);

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

    public void playBurnSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.burn);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quemarlarge);

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

    public void playKepiSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.kepi);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quepislarge);

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

    public void playCherubSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.cherub);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.querubinlarge);
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

    public void playCheeseSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.cheese);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quesolarge);

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

    public void playJawSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.jaw);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quijadalarge);

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

    public void playChemistrySound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.chemistry);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quimicalarge);

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

    public void playChemicalSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.chemical);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quimicolarge);

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

    public void playKimonoSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterQActivity.this, R.raw.kimono);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.quimonolarge);

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

    public void returnToUnderSixQLetter(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(this, UnderSixActivity.class);
        startActivity(intent);
    }

    public void goToOtherWordsQLetter(View view) {
        Intent intent  = new Intent(this, LetterQActivityTwo.class);
        startActivity(intent);
    }
}
