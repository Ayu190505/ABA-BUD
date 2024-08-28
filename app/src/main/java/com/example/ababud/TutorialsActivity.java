package com.example.ababud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.ababud.TutorialSubActivities.ActivitiesActivity;
import com.example.ababud.TutorialSubActivities.BookActivity;
import com.example.ababud.TutorialSubActivities.FoodActivity;
import com.example.ababud.TutorialSubActivities.GoogleClassroomActivity;
import com.example.ababud.TutorialSubActivities.LockerActivity;
import com.example.ababud.TutorialSubActivities.ManageBacActivity;
import com.example.ababud.TutorialSubActivities.PTSCActivity;
import com.example.ababud.TutorialSubActivities.PayActivity;
import com.example.ababud.TutorialSubActivities.ReportCardsActivity;
import com.example.ababud.TutorialSubActivities.UniformActivity;

public class TutorialsActivity extends AppCompatActivity {

    private ImageView locker, managebac, classroom, pay, book, uniform, food, ptsc, report, activities;
    private ImageView backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);

        ImageView locker = (ImageView) findViewById(R.id.locker);
        locker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TutorialsActivity.this, LockerActivity.class));
                finish();
            }
        });

        ImageView managebac = (ImageView) findViewById(R.id.managebac);
        managebac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, ManageBacActivity.class));
                finish();
            }
        });

        ImageView classroom = (ImageView) findViewById(R.id.classroom);
        classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, GoogleClassroomActivity.class));
                finish();
            }
        });

        ImageView pay = (ImageView) findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, PayActivity.class));
                finish();
            }
        });

        ImageView book = (ImageView) findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, BookActivity.class));
                finish();
            }
        });

        ImageView uniform = (ImageView) findViewById(R.id.uniform);
        uniform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, UniformActivity.class));
                finish();
            }
        });

        ImageView food = (ImageView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, FoodActivity.class));
                finish();
            }
        });

        ImageView ptsc = (ImageView) findViewById(R.id.ptsc);
        ptsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, PTSCActivity.class));
                finish();
            }
        });

        ImageView report = (ImageView) findViewById(R.id.report);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, ReportCardsActivity.class));
                finish();
            }
        });

        ImageView activities = (ImageView) findViewById(R.id.activities);
        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (TutorialsActivity.this, ActivitiesActivity.class));
                finish();
            }
        });

        ImageView backButton = (ImageView) findViewById(R.id.tutorialsBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TutorialsActivity.this, HomeActivity.class));
                finish();
            }
        });


    }
}