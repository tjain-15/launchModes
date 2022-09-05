package com.example.launchmodes;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onStart() {
        super.onStart();
        Util.getInfo(this);
    }

    public void mainClicked(View view){
        launchActivity(MainActivity.class);
    }

    public void aClicked(View view){
        launchActivity(ActivityA.class);
    }

    public void bClicked(View view){
        launchActivity(ActivityB.class);
    }

    public void cClicked(View view){
        launchActivity(ActivityC.class);
    }

    private void launchActivity(Class<?> cls){
        intent =new Intent(this,cls);
        startActivity(intent);
    }
}