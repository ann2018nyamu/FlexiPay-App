package com.ekenya.android.flexipayapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;


public class OnBoardingActivity extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<Fragment> fragmentList = new ArrayList<>();
    private IntroSliderAdapter introSliderAdapter = new IntroSliderAdapter(this);
    private ViewPager2 viewPager;
    private IndicatorLayout indicatorLayout;
    private Button registerButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        //   binding = DataBindingUtil.setContentView(this, R.layout.activity_onboarding);

        registerButton = findViewById(R.id.btn_register);

        indicatorLayout = findViewById(R.id.indicatorLayout);
        viewPager = findViewById(R.id.vpIntroSlider);

        registerButton.setOnClickListener(this);
        viewPager.setAdapter(introSliderAdapter);
        fragmentList.addAll(List.of(new Fragment1(),new Fragment2(),new Fragment3()));
        introSliderAdapter.setFragmentList(fragmentList);
        indicatorLayout.setIndicatorCount(introSliderAdapter.getItemCount());
        indicatorLayout.selectCurrentPosition(0);
        registerListeners();
    }

    private void registerListeners() {
        viewPager.registerOnPageChangeCallback(
                new ViewPager2.OnPageChangeCallback() {
                    @Override
                    public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
                        super.onPageSelected(pos);
                        indicatorLayout.selectCurrentPosition(pos);
                    }
                }
        );


    }

    @Override
    public void onClick(View v)
    {

        startActivity(new Intent(this,NumberActivity.class));
    }
}


