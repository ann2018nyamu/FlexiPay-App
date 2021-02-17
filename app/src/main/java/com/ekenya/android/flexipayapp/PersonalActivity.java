package com.ekenya.android.flexipayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class PersonalActivity extends AppCompatActivity {

    private Context mContext;
    private Button button;
    private ImageView imageView;
    private AutoCompleteTextView  genderAutoCompleteTextView;
    private TextInputLayout dobTxtInput;
    private List<String> genderList = Arrays.asList("Male", "Female", "I rather not say");
    private ArrayAdapter adapter;
    private EditText date;
    DatePickerDialog datePickerDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        ImageView imageView = findViewById(R.id.back2);
        genderAutoCompleteTextView = findViewById(R.id.Tl_gender);

        // initiate the date picker and a button
        date = (EditText) findViewById(R.id.Tl_date);
        mContext = this;


        adapter = new ArrayAdapter(getApplicationContext(),R.layout.gender_list_item, genderList);
        genderAutoCompleteTextView.setAdapter(adapter);




        Button button = findViewById(R.id.CreateAccount_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDashBoardActivity();

            }

        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(PersonalActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                date.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
                    }
    public void openDashBoardActivity(){
        Intent intent = new Intent(this, DashBoardActivity.class);
        startActivity(intent);
    }

}