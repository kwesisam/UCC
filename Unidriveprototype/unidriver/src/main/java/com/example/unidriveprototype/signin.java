package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {

    EditText email, password;
    TextView email_error, password_error;
    Button  signin_button;

      static Boolean validP, validE;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        email = findViewById(R.id.signin_email);
        password = findViewById(R.id.signin_password);
        email_error = findViewById(R.id.signupa_emailerror);
        password_error = findViewById(R.id.signin_password_error);
        signin_button = findViewById(R.id.signup_btn);


        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validEmail();
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validPassword();
            }
        });

        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this, homepage.class);


                if(validE && validP){
                    startActivity(intent);
                }else{
                    Toast.makeText(signin.this, "Wrong Input, Try Again", Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });


    }

    private void validPassword() {

        String a = password.getText().toString();

        if(a.isEmpty()){
            validP = false;
            password_error.setVisibility(View.VISIBLE);
            password_error.setText("This field is required");
        }else{
            validP = true;
            password_error.setVisibility(View.GONE);
        }

    }

    private void validEmail() {
        if(android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
            validE = true;
            email_error.setVisibility(View.GONE);
        }else{
            if(email.getText().toString().isEmpty()){
                email_error.setText("This field is required");
                email_error.setVisibility(View.VISIBLE);
                validE = false;
            }else{
                validE = false;
                email_error.setText("Invalid email address");
                email_error.setVisibility(View.VISIBLE);
            }
        }

    }
}