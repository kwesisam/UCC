package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class SignUpb extends Activity {
    /*private static final int REQUEST_IMAGE_PICK = 2;
    private Uri imageUri;
    private Button imageBtn;
    private ImageView userImage;
    private EditText userPhone;
    private TextView userPhoneError;
    private Button signupWithEmail = findViewById(R.id.signupWithEmail);*/

    private LinearLayout wEmail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upb);


       /* signupWithEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpb.this, SignUp.class);
                startActivity(intent);
            }
        });*/

        wEmail = findViewById(R.id.editEmail);
        wEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpb.this, signUpc.class);
                startActivity(intent);
            }
        });
    }

}




