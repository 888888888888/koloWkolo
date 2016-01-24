package com.example.crejzer.kolkoapp;

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

/**
 * Created by Crejzer on 2015-12-29.
 */
public class PlayerActivity extends Activity {

    private static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Menu" ;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        // Tworzenie przycisku
        GradientDrawable roundedRectangle = (GradientDrawable) this.getResources().getDrawable(R.drawable.rounded_rectangle);
        final Button button = (Button) findViewById(R.id.buttonPleyer);

        button.setText("SZUKAJ PRZECIWNIKA");
        button.setTextColor(getResources().getColor(R.color.white));
        button.setBackgroundDrawable(roundedRectangle);

        final Toast toast = Toast.makeText(this, "Prosze podac nazwe wieksza od 3 znakow", Toast.LENGTH_SHORT);
        editText = (EditText) findViewById(R.id.editPlayer);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int dlugoscTekstu = editText.getText().length();
                Log.d("test", String.valueOf(editText.getText().length()));
                if (dlugoscTekstu < 3){

                    toast.show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

                int dlugoscTekstu = editText.getText().length();
                Log.d("test", String.valueOf(editText.getText().length()));
                if (dlugoscTekstu >= 3) {

                    button.setVisibility(View.VISIBLE);
                } else {

                    button.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void setPlayer(View view) {

        Intent intent = new Intent(view.getContext(), SearchActivity.class);

        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
