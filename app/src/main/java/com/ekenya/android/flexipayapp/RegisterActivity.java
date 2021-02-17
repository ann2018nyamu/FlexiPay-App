package com.ekenya.android.flexipayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    public static ViewPager viewPager;
   // RegisterPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        viewPager=findViewById(R.id.viewpager);
       // adapter=new RegisterPageAdapter(this);
       // viewPager.setAdapter(adapter);

    }

}