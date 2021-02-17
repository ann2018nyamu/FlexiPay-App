package com.ekenya.android.flexipayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InformationActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private Context mContext;
    private AutoCompleteTextView   occupationAutoCompleteTextView;
    private List<String> occupationList = Arrays.asList("Mobile Developer", "Nurse", "Teacher", "Engineering", "Marketing and Communication",
            "Hospitality", "Lawyer", "Pilot & aviation", "Politics", "Architecture",
            "Procurement", "Acturial Science", "Journalism", "Police ", "Customer care",
            "Watchman", "Web Developer", "Graphic and Web Design", "Quantity Survey",
            "Flight Attendant", "Banking", "Accounting");
    private ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        ImageView imageView = findViewById(R.id.back_arrow);
        Button button = findViewById(R.id.Continue_button);
        occupationAutoCompleteTextView = findViewById(R.id.Tl_occupation);
        mContext = this;


        adapter = new ArrayAdapter(getApplicationContext(),R.layout.occupation_list_item, occupationList);
        occupationAutoCompleteTextView.setAdapter(adapter);

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