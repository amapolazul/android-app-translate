package com.amapolazul.www.traductorandriod;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class Intro extends Activity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                System.out.println("displayyy");
                try {
                    Thread.sleep(SPLASH_TIME_OUT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("mostrando esta vaina final por favor funciona");
                Intent i = new Intent(Intro.this, IntroTwo.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.mainfadein, R.anim.mainfadeout);
            }
        }, SPLASH_TIME_OUT);
    }
}
