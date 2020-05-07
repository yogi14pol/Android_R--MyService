package com.clicks.yogi.myservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button but1,but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = (Button)findViewById(R.id.but1);
        but2 = (Button)findViewById(R.id.but2);
    }

    public void dothis(View v){

        int k = v.getId();
        switch (k)
        {
            case R.id.but1:
                Intent i1 = new Intent(this,Service1.class);
                startService(i1);
                break;
            case R.id.but2:
                Intent i2 = new Intent(this,Service1.class);
                stopService(i2);
                break;
        }
    }
}