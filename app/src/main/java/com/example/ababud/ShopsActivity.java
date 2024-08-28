package com.example.ababud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShopsActivity extends AppCompatActivity {

    private ImageView backButton;
    private ImageView arrow1, arrow2, arrow3, arrow4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);

        ImageView backButton = (ImageView) findViewById(R.id.shopBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShopsActivity.this, HomeActivity.class));
                finish();
            }
        });

        arrow1 = (ImageView) findViewById(R.id.imageView8);
        arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShopsActivity.this, MapsDuplicateActivity.class));
                finish();
            }
        });

        arrow2 = (ImageView) findViewById(R.id.imageView6);
        arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShopsActivity.this, MapsDuplicateActivity.class));
                finish();
            }
        });


        arrow3 = (ImageView) findViewById(R.id.imageView7);
        arrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShopsActivity.this, MapsDuplicateActivity.class));
                finish();
            }
        });


        arrow4 = (ImageView) findViewById(R.id.imageView2);
        arrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShopsActivity.this, MapsDuplicateActivity.class));
                finish();
            }
        });

    }
}