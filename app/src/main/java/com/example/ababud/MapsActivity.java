package com.example.ababud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class MapsActivity extends AppCompatActivity {

    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        PhotoView photoView = (PhotoView) findViewById(R.id.editedMap);
        photoView.setImageResource(R.drawable.ms_aba_map);

        ImageView backButton = (ImageView) findViewById(R.id.mapsBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MapsActivity.this, HomeActivity.class));
                finish();
            }
        });
    }
}