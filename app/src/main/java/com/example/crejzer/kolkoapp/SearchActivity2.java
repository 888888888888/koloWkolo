package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.example.crejzer.kolkoapp.views.MyProgressBar;

/**
 * Created by Crejzer on 2016-01-25.
 */
public class SearchActivity2 extends Activity {

    private MyProgressBar pBar;

    private static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Player";
    private static final String EXTRA_MESSAGE2 = "com.example.crejzer.kolkoapp.Player2" ;

    private String nick;
    private String nick2;

    int totalProgressTime = 100;
    Intent intent;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search2);

        intent = getIntent();
        nick = intent.getStringExtra(EXTRA_MESSAGE);
        nick2 = intent.getStringExtra(EXTRA_MESSAGE2);

        Log.d("test",nick);
        Log.d("test",nick2);

        pBar = (MyProgressBar) findViewById(R.id.progressBar2);

        intent = new Intent(this, Game.class);
        intent.putExtra(EXTRA_MESSAGE,nick);
        intent.putExtra(EXTRA_MESSAGE2,nick2);

        new Connector().execute();
    }

    private class Connector extends AsyncTask {


        @Override
        protected void onPreExecute() {
            pBar.startAnimation();
        }

        @Override
        protected Object doInBackground(Object[] params) {

            int jumpTime = 0;
            while(jumpTime < totalProgressTime) {
                try {
                    Thread.sleep(200);
                    jumpTime += 5;

                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            return null;
        };

        @Override
        protected void onPostExecute(Object o) {

            pBar.dismiss();
            startActivity(intent);
        };
    }
}
