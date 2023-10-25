package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class view extends AppCompatActivity {
    private ViewPager viewPager;
    private LinearLayout tab1, tab2, tab3 , tab4;
    private ImageView home_logo, service_logo,history_logo, account_logo;
    private TextView home_name, service_name, history_name, account_name;
    private String name, email;

    String firstName, lastName, u_email;

    public view() {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        viewPager = findViewById(R.id.viewPager);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        tab4 = findViewById(R.id.tab4);

        home_logo = findViewById(R.id.home_log);
        home_name = findViewById(R.id.home_name);
        service_logo = findViewById(R.id.service_logo);
        service_name = findViewById(R.id.service_name);
        history_logo = findViewById(R.id.history_logo);
        history_name = findViewById(R.id.history_name);
        account_logo = findViewById(R.id.account_logo);
        account_name = findViewById(R.id.account_name);

        String ColorRes = "#133F9E";
        int color = Color.parseColor(ColorRes);
        home_name.setTextColor(color);
        home_logo.setImageResource(R.drawable.home_iconblue);


         String f_name = getIntent().getStringExtra("first");
         String l_name = getIntent().getStringExtra("last");

        System.out.println(f_name);
        System.out.println(l_name);
        /*F4 f4 = new F4();
        Bundle args = new Bundle();
        args.putString("firstName", f_name);
        args.putString("lastName",l_name);
        args.putString("email", email);
        f4.setArguments(args);*/

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
             firstName = bundle.getString("firstName");
             lastName = bundle.getString("lastName");
             u_email = bundle.getString("email");

            System.out.println(firstName + " " + lastName + " " + email);

            Bundle args = new Bundle();
            args.putString("firstName", firstName);
            args.putString("lastName", lastName);
            args.putString("email", email);
            System.out.println(args);
            F4 f4 = new F4(firstName,lastName, u_email);
            f4.setArguments(args);
        }
            // home_name.setTextColor();
        //home_logo.set
        // Set up the ViewPager with the adapter
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        // Handle tab selection
        tab1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                homeB();
                viewPager.setCurrentItem(0);
                serviceB();
                accountB();
                historyB();
            }
        });

        tab2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                homeA();
                serviceA();
                historyB();
                accountB();
                viewPager.setCurrentItem(1);

            }
        });

        tab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(2);
                homeA();
                historyA();
                serviceB();
                accountB();
               // String black = "#000000";
                //int col = Color.parseColor(black);
                //String ColorRs = "#133F9E";
                //int colorb = Color.parseColor(ColorRs);
                //history_name.setTextColor(colorb);
                //home_name.setTextColor(col);
            }
        });

        tab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeA();
                accountA();
                serviceB();
                historyB();

                viewPager.setCurrentItem(3);
            }
        });


    }

    // PagerAdapter for handling fragments
    private class PagerAdapter extends FragmentPagerAdapter {

        public PagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {

            if(position == 0){
                return new F1();
            }else if(position == 1){
                return new F2();
            }else if(position == 2){
                return new F3();
            }else if(position == 3){
                return new F4(firstName, lastName, u_email);
            }else{
                return null;
            }

        }

        @Override
        public int getCount() {
            return 4; // Return the number of fragments
        }
    }

    private void homeA(){
        home_logo.setImageResource(R.drawable.home_icon_black);
        String black = "#000000";
        int col = Color.parseColor(black);
        home_name.setTextColor(col);
    }

    private void homeB(){
        home_logo.setImageResource(R.drawable.home_iconblue);
        String blue = "#133F9E";
        int col = Color.parseColor(blue);
        home_name.setTextColor(col);
    }

    private void serviceA()
    {
        String ColorRe = "#133F9E";
        int colora = Color.parseColor(ColorRe);
        service_name.setTextColor(colora);
        service_logo.setImageResource(R.drawable.car_drive_service_blue);
    }

    private void serviceB(){
        String ColorRe = "#000000";
        int colora = Color.parseColor(ColorRe);
        service_name.setTextColor(colora);
        service_logo.setImageResource(R.drawable.car_drive_service_black);

    }

    private void historyA(){
        String ColorRs = "#133F9E";
        int colorb = Color.parseColor(ColorRs);
        history_name.setTextColor(colorb);
        history_logo.setImageResource(R.drawable.history_icon_blue);
    }

    private void historyB(){
        String ColorRs = "#000000";
        int colorb = Color.parseColor(ColorRs);
        history_name.setTextColor(colorb);
        history_logo.setImageResource(R.drawable.history_icon_black);
    }

    private void accountA(){
        String ColorR = "#133F9E";
        int colorc = Color.parseColor(ColorR);
        account_name.setTextColor(colorc);
        account_logo.setImageResource(R.drawable.account_profile_blue_icon);
    }

    private void accountB(){
        String ColorR = "#000000";
        int colorc = Color.parseColor(ColorR);
        account_name.setTextColor(colorc);
        account_logo.setImageResource(R.drawable.account_profile_black_icon);
    }
}