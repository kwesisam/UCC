package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    Animation bottom_anim;
    ImageView image;
    Button login_btn, sign_btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image = findViewById(R.id.logo);
        login_btn = findViewById(R.id.login_btn);
        sign_btn = findViewById(R.id.signup_btn);

        bottom_anim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        login_btn.setAnimation(bottom_anim);
        sign_btn.setAnimation(bottom_anim);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(splash.this, homepage.class);
                startActivity(intent);
                finish();
            }
        });

        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(splash.this, signupa.class);
                startActivity(intent);
                finish();
            }
        });
    }
}