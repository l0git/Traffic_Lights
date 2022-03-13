package com.example.trafficlights;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {


    Button button_yellow, button_red, button_green;
    ConstraintLayout Screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_yellow = (Button)findViewById(R.id.button_yellow);
        button_red = (Button)findViewById(R.id.button_red);
        button_green = (Button)findViewById(R.id.button_green);
        Screen = findViewById(R.id.Screen);
        button_yellow();
        button_red();
        button_green();
    }

    private void button_red() {
        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.redColor));

            }
        });
    }

    private void button_yellow() {
        button_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));

            }
        });
    }

    private void button_green() {
        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));

            }
        });
    }
    
    
}