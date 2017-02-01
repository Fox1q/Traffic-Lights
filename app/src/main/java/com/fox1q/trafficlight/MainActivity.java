package com.fox1q.trafficlight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mainLayout;
    private int lastColor;
    Button redBtn;
    Button greenBtn;
    Button yellowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = (LinearLayout) findViewById(R.id.activity_main);
        redBtn = (Button) findViewById(R.id.redBtn);
        greenBtn = (Button) findViewById(R.id.greenBtn);
        yellowBtn = (Button) findViewById(R.id.yellowBtn);

        redBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.RED);
                lastColor = Color.RED;
            }
        });

        yellowBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.YELLOW);
                lastColor = Color.YELLOW;
            }
        });

        greenBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.GREEN);
                lastColor = Color.GREEN;
            }
        });
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("lastColor", lastColor);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lastColor = savedInstanceState.getInt("lastColor");
        mainLayout.setBackgroundColor(lastColor);
    }
}