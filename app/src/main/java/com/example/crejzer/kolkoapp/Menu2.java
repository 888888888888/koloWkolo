package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Crejzer on 2015-09-08.
 */
public class Menu2 extends Activity {

    public static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Menu";
    public static final String EXTRA_MESSAGE2 = "com.example.crejzer.kolkoapp.Menu2";
    public String message = "";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        Intent intent = getIntent();
        String player1 = intent.getStringExtra(Menu.EXTRA_MESSAGE);

        this.message = player1;

        // Tworzenie przycisku
        GradientDrawable roundedRectangle = (GradientDrawable) this.getResources().getDrawable(R.drawable.rounded_rectangle);
        Button button = (Button) findViewById(R.id.button2);

        button.setText("OK");
        button.setBackgroundDrawable(roundedRectangle);

    }

    public void setPlayer2(View v){
        Intent intent = new Intent(v.getContext(), Game.class);

        EditText editText = (EditText) findViewById(R.id.editText2);

        String message2 = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2, message2);

        startActivity(intent);
    }

}
