package com.amapolazul.www.traductorandriod;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class IntroTwo extends Activity {

    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_two);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                System.out.println("displayyy");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("mostrando esta vaina final por favor funciona dos");
                Intent i = new Intent(IntroTwo.this, IntroThree.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.mainfadein, R.anim.mainfadeout);
            }
        }, SPLASH_TIME_OUT);
    }
}
