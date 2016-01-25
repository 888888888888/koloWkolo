package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Crejzer on 2015-12-29.
 */
public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        // Tworzenie przycisku
        GradientDrawable roundedRectangle = (GradientDrawable) this.getResources().getDrawable(R.drawable.rounded_rectangle);
        Button button = (Button) findViewById(R.id.button);

        button.setText("GRAJ");
        button.setTextColor(getResources().getColor(R.color.white));
        button.setBackgroundDrawable(roundedRectangle);
    }

    public void playGame(View view) {

        Intent intent = new Intent(view.getContext(), PlayerActivity.class);
        startActivity(intent);
    }
}
