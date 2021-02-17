package com.ekenya.android.flexipayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NumberActivity extends AppCompatActivity {
    private Button button;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ImageView imageView = findViewById(R.id.back);

        Button button = findViewById(R.id.continue_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInformationActivity();

            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashBoardActivity();
            }
        });
    }

    public void openInformationActivity(){
        Intent intent = new Intent(this, InformationActivity.class);
        startActivity(intent);
    }

    public void openDashBoardActivity(){
        Intent intent = new Intent(this, OnBoardingActivity.class);
        startActivity(intent);
    }

        }