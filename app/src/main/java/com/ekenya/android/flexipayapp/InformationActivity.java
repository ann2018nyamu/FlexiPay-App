package com.ekenya.android.flexipayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class InformationActivity extends AppCompatActivity {

    private Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        ImageView imageView = findViewById(R.id.back_arrow);

        Button button = findViewById(R.id.Continue_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPersonalActivity();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
    public void openPersonalActivity(){
        Intent intent = new Intent(this, PersonalActivity.class);
        startActivity(intent);

    }
}