package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import java.util.Arrays;

public class Ratings extends AppCompatActivity{

    private Button submitBtn;
    private EditText userComment;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);

        submitBtn = findViewById(R.id.submitBtn);
        userComment = findViewById(R.id.userComment);
        ratingBar = findViewById(R.id.ratingBar);

    }


}

