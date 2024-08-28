package com.example.ababud.TutorialSubActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.ababud.R;
import com.example.ababud.TutorialsActivity;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class PTSCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_t_s_c);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.lockerTutorial);
        getLifecycle().addObserver(youTubePlayerView);

        ImageView backButton = (ImageView) findViewById(R.id.tutorialsBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PTSCActivity.this, TutorialsActivity.class));
                finish();
            }
        });

    }
}