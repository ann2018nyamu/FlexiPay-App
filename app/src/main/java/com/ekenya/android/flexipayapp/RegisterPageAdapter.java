package com.ekenya.android.flexipayapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class RegisterPageAdapter extends PagerAdapter {

    Context context;
    public  RegisterPageAdapter(Context context){ this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.register_screen,container,false);

        ImageView logo=view.findViewById(R.id.logo);
        ImageView ind1=view.findViewById(R.id.ind1);
        ImageView ind2=view.findViewById(R.id.ind2);
        ImageView ind3=view.findViewById(R.id.ind3);

        TextView title=view.findViewById(R.id.title);
        TextView description=view.findViewById(R.id.description);
        TextView login=view.findViewById(R.id.login);

        Button btnregister=view.findViewById(R.id.btn_Register);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,NumberActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        switch (position)
        {
            case 0:
                logo.setImageResource(R.drawable.flexipay_logo);
                ind1.setImageResource(R.drawable.selected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.unselected);
                title.setText("Welcome to Flexi Pay");
                description.setText("A Fast &amp; Efficient Service to Go Cashless!");
                login.setText("Already have an account? Login");

                break;
            case 1:
                logo.setImageResource(R.drawable.flexipay_logo);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.selected);
                ind3.setImageResource(R.drawable.unselected);
                title.setText("Welcome to Flexi Pay");
                description.setText("A Fast &amp; Efficient Service to Go Cashless!");
                login.setText("Already have an account? Login");

                break;
            case 2:
                logo.setImageResource(R.drawable.flexipay_logo);
                ind1.setImageResource(R.drawable.unselected);
                ind2.setImageResource(R.drawable.unselected);
                ind3.setImageResource(R.drawable.selected);
                title.setText("Welcome to Flexi Pay");
                description.setText("A Fast &amp; Efficient Service to Go Cashless!");
                login.setText("Already have an account? Login");

        }
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
