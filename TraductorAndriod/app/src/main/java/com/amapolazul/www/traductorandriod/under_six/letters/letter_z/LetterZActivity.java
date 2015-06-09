package com.amapolazul.www.traductorandriod.under_six.letters.letter_z;

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

public class LetterZActivity extends Activity {

    private Dialog busyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_z);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_letter_z, menu);
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

    public void playSapphireSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.sapphire);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zafirolarge);

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

    public void playSambaSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.samba);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zambalarge);

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

    public void playDivingSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.diving);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zambullirlarge);

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

    public void playCarrotSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.carrot);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zanahorialarge);

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

    public void playStiltSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.stilt);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zancolarge);
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

    public void playDitchSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.ditch);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zanjalarge);

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

    public void playShoemakerSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.shoemaker);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zapaterolarge);

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

    public void playSlipperSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.slipper);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zapatillalarge);

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

    public void playShoeSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.shoe);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zapatolarge);

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

    public void playSapodillaSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterZActivity.this, R.raw.sapodilla);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.zapotelarge);

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

    public void returnToUnderSixZLetter(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(this, UnderSixActivity.class);
        startActivity(intent);
    }

    public void goToOtherWordsZLetter(View view) {
        Intent intent  = new Intent(this, LetterZActivityTwo.class);
        startActivity(intent);
    }
}
