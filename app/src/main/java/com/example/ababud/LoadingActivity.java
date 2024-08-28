package com.example.ababud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        Thread thread = new Thread(){

            public void run(){
                try {

                    sleep(1500);

                }
                catch (Exception e){

                    e.printStackTrace();

                }
                finally {

                    Intent intent = new Intent (LoadingActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();

                }
            }

        };thread.start();

    }
}