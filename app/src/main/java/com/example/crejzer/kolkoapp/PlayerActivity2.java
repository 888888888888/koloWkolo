package com.example.crejzer.kolkoapp;

/**
 * Created by Crejzer on 2016-01-25.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlayerActivity2 extends Activity {

    private static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Player";
    private static final String EXTRA_MESSAGE2 = "com.example.crejzer.kolkoapp.Player2";

    EditText editText;
    public String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player2);

        // Tworzenie przycisku
        GradientDrawable roundedRectangle = (GradientDrawable) this.getResources().getDrawable(R.drawable.rounded_rectangle);
        final Button button = (Button) findViewById(R.id.buttonPleyer2);

        Intent intent = getIntent();
        String player1 = intent.getStringExtra(EXTRA_MESSAGE);

        message = player1;
        Log.d("test",message);

        button.setText("DO GRY");
        button.setTextColor(getResources().getColor(R.color.white));
        button.setBackgroundDrawable(roundedRectangle);

        final Toast toast = Toast.makeText(this, "Prosze podac nazwe wieksza od 3 znakow", Toast.LENGTH_SHORT);
        editText = (EditText) findViewById(R.id.editPlayer2);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int dlugoscTekstu = editText.getText().length();
                if (dlugoscTekstu < 3){

                    toast.show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

                int dlugoscTekstu = editText.getText().length();
                if (dlugoscTekstu >= 3) {

                    button.setVisibility(View.VISIBLE);
                } else {

                    button.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void setPlayer(View view) {

        Intent intent = new Intent(view.getContext(), SearchActivity2.class);

        EditText editText = (EditText) findViewById(R.id.editPlayer2);

        String message2 = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE2, message2);

        startActivity(intent);
    }

}
