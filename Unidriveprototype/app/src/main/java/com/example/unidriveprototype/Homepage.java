package com.example.unidriveprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Homepage extends Activity {

    private LinearLayout signUp ;
    private TextView logIn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_homepage);
        signUp = findViewById(R.id.getStart);
        logIn = findViewById(R.id.signin);

        Intent intent = getIntent();
        String toClose = intent.getStringExtra("toClose");
        System.out.println("homepage: " + toClose);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.out.println("sign up btn is clicked");
                Intent intenta = new Intent(Homepage.this,SignUp.class);
                startActivity(intenta);

            }
        });

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.out.println("sign in btn is clicked");
                Intent intentb = new Intent(Homepage.this, SignIn.class);
                intentb.putExtra("toClose", toClose);
                startActivity(intentb);

            }
        });


      /*  signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,SignUp.class);
                startActivity(intent);

            }
        });*/

        /*signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this, SignIn.class);
                startActivity(intent);
            }
        });*/
    }
}