package com.example.unidriveprototype;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class homepage extends AppCompatActivity {
    private ViewPager viewPager;
    LinearLayout home_tab, service_tab, setting_tab;
    TextView home, service, setting;

    ImageView home_img, service_img, setting_img;
    String black = "#000000";
    String blue = "#133F9E";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        home_tab = findViewById(R.id.home_tab);
        service_tab = findViewById(R.id.service_tab);
        setting_tab = findViewById(R.id.setting_tab);
        home = findViewById(R.id.home);
        service = findViewById(R.id.service);
        setting = findViewById(R.id.setting);
        home_img = findViewById(R.id.home_img);
        service_img = findViewById(R.id.service_img);
        setting_img = findViewById(R.id.setting_img);
        viewPager = findViewById(R.id.viewPager);
        home_black();

        home_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
                home_blue();
                service_black();
                setting_black();
            }
        });

        service_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
                home_black();
                service_blue();
                setting_black();
            }
        });

        setting_tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
                home_black();
                service_black();
                setting_blue();
            }
        });


        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

    private class  PagerAdapter extends FragmentPagerAdapter{

        public PagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return new F1();
            }else if(position == 1){
                return new F2();
            }else if(position == 2){
                return new F3();
            }else{
                return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    void home_black(){
        int color = Color.parseColor(black);
        home.setTextColor(color);
        home_img.setImageResource(R.drawable.home_icon_black);
    }

    void home_blue(){
        int color = Color.parseColor(blue);
        home.setTextColor(color);
        home_img.setImageResource(R.drawable.home_iconblue);

    }

    void service_black(){
        int color = Color.parseColor(black);
        service.setTextColor(color);
        service_img.setImageResource(R.drawable.car_drive_service_black);
    }

    void service_blue(){
        int color = Color.parseColor(blue);
        service.setTextColor(color);
        service_img.setImageResource(R.drawable.car_drive_service_blue);
    }

    void setting_black(){
        int color = Color.parseColor(black);
        setting.setTextColor(color);
        setting_img.setImageResource(R.drawable.account_profile_black_icon);
    }

    void setting_blue(){
        int color = Color.parseColor(black);
        setting.setTextColor(color);
        setting_img.setImageResource(R.drawable.account_profile_blue_icon);
    }
}