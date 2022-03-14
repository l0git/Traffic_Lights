package com.example.trafficlights;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {


    Button buttonYellow, buttonRed, buttonGreen;
    ConstraintLayout Screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonYellow = (Button)findViewById(R.id.buttonYellow);
        buttonRed = (Button)findViewById(R.id.buttonRed);
        buttonGreen = (Button)findViewById(R.id.buttonGreen);
        Screen = findViewById(R.id.Screen);
        buttonYellow();
        buttonRed();
        buttonGreen();
    }

    private void buttonRed() {
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.redColor));

            }
        });
    }

    private void buttonYellow() {
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));

            }
        });
    }

    private void buttonGreen() {
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));

            }
        });
    }
}