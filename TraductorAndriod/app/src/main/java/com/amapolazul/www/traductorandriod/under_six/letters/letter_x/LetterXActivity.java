package com.amapolazul.www.traductorandriod.under_six.letters.letter_x;

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

public class LetterXActivity extends Activity {

    private Dialog busyDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_x);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_letter_x, menu);
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

    public void playXenonSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterXActivity.this, R.raw.xenon);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.xenonlarge);

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

    public void playXerographySound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterXActivity.this, R.raw.xerography);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.xerografialarge);

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

    public void playXylophoneSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterXActivity.this, R.raw.xylophone);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.xilofonolarge);

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

    public void playWoodcutSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterXActivity.this, R.raw.woodcut);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.xilografialarge);

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

    public void playXylographSound(View view) {
        MediaPlayer mPlayer = MediaPlayer.create(LetterXActivity.this, R.raw.xylograph);
        busyDialog = new Dialog(this, R.style.lightbox_dialog);
        busyDialog.setContentView(R.layout.lightbox_dialog);
        ((ImageView)busyDialog.findViewById(R.id.dialogText)).setImageResource(R.drawable.xilografolarge);
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

    public void returnToUnderSixXLetter(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(this, UnderSixActivity.class);
        startActivity(intent);
    }
}
