package com.example.anotherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceIntent = new Intent();
        serviceIntent.setComponent(new ComponentName("com.example.anotherapp","com.example.anotherapp.MainActivity"));



        findViewById(R.id.btnStarAppService).setOnClickListener(this);
        findViewById(R.id.btnStopAppService).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStarAppService:
                startService(serviceIntent);
                break;
            case R.id.btnStopAppService:
                stopService(serviceIntent);
                break;
        }
    }
}