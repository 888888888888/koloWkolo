package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.example.crejzer.kolkoapp.views.MyProgressBar;

import java.sql.SQLException;

/**
 * Created by Crejzer on 2015-12-29.
 */
public class SearchActivity extends Activity {

    private MyProgressBar pBar;

    private static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Player" ;

    private String nick;
    private Intent intent;

    int totalProgressTime = 50;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        intent = getIntent();
        nick = intent.getStringExtra(EXTRA_MESSAGE);
        Log.d("test", nick);

        pBar = (MyProgressBar) findViewById(R.id.progressBar);
        intent = new Intent(this, PlayerActivity2.class);

        intent.putExtra(EXTRA_MESSAGE,nick);

        new Connector().execute();

    }

    private class Connector extends AsyncTask{


        @Override
        protected void onPreExecute() {
            pBar.startAnimation();
        }

        @Override
        protected Object doInBackground(Object[] params) {

            DataBase db = new DataBase();

            if(!db.toDB(nick)){

                Log.d("test", "Uzytkownik juz jest w bazie");
                try {
                    db.closeDataBase();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {

                Log.d("test", "Nowy użtkownik dodany");
                try {
                    db.closeDataBase();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


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
