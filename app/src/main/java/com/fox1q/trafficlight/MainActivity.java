package com.fox1q.trafficlight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.activity_main);
    }

    public void onClick(TextView view) {
        switch (view.getId()) {
            case R.id.button_red:
                ll.setBackgroundColor(Color.RED);
                break;
            case R.id.button_yellow:
                ll.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.button_green:
                ll.setBackgroundColor(Color.GREEN);
                break;
        }
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("lastColor", ll.getDrawingCacheBackgroundColor());
    }
}