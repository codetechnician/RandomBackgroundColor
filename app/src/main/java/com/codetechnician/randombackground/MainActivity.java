package com.codetechnician.randombackground;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // create variables to grab layout and image button
    private ConstraintLayout layout;
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab layout and button by ID
        layout = findViewById(R.id.constraintLayout);
        button = findViewById(R.id.imageButton);


        // define button's click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // generate a new random number
                Random random = new Random();

                // generate a background color using RBG
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

                // set layout's background color
                layout.setBackgroundColor(color);
            }
        });

    }
}
