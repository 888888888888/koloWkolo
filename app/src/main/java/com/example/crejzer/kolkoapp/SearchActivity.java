package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.crejzer.kolkoapp.views.MyProgressBar;

/**
 * Created by Crejzer on 2015-12-29.
 */
public class SearchActivity extends Activity {

    private MyProgressBar pBar;
    private static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Menu" ;
    private String nick;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        Intent intent = getIntent();
        nick = intent.getStringExtra(EXTRA_MESSAGE);

        Log.d("test",nick);

        pBar = (MyProgressBar) findViewById(R.id.progressBar);
        pBar.startAnimation();

    }
}
