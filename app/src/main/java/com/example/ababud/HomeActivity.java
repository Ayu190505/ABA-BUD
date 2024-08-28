package com.example.ababud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView shopsNav;
    private ImageView mapsNav;
    private ImageView tutorialsNav;
    private ImageView activitiesNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView shopsNav = (ImageView) findViewById(R.id.shopsNav);
        shopsNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (HomeActivity.this, ShopsActivity.class));
                finish();
            }
        });

        ImageView mapsNav = (ImageView) findViewById(R.id.mapsNav);
        mapsNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (HomeActivity.this, MapsActivity.class));
                finish();
            }
        });

        ImageView tutorialsNav = (ImageView) findViewById(R.id.tutorialsNav);
        tutorialsNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (HomeActivity.this, TutorialsActivity.class));
                finish();
            }
        });

        ImageView activitiesNav = (ImageView) findViewById(R.id.activitiesNav);
        activitiesNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (HomeActivity.this, ActivitiesActivity.class));
                finish();
            }
        });

    }
}