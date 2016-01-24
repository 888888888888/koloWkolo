package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Menu extends Activity {

    public static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Menu" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Tworzenie przycisku
        GradientDrawable roundedRectangle = (GradientDrawable) this.getResources().getDrawable(R.drawable.rounded_rectangle);
        Button button = (Button) findViewById(R.id.button);

        button.setText("OK");
        button.setTextColor(getResources().getColor(R.color.white));
        button.setBackgroundDrawable(roundedRectangle);

    }

    public void setPlayer1(View v){
        Intent intent = new Intent(v.getContext(), Menu2.class);

        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
