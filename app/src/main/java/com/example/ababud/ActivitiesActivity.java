package com.example.ababud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivitiesActivity extends AppCompatActivity {

    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        ImageView backButton = (ImageView) findViewById(R.id.activitiesBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivitiesActivity.this, HomeActivity.class));
                finish();
            }
        });

    }
}