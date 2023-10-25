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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signUpc extends AppCompatActivity {

    private EditText name, s_name, emaila, password, confirm_passowrd;
    private TextView nameerror, s_nameerror, emailaerror, password_error, confirm_password_error;


    private Button upBtn, back_btn;

    private Boolean validFN;
    private Boolean validSN;
    private Boolean validEmail;
    private Boolean validPassword;
    private Boolean validConfirmPassword;
    private Boolean matchPassword;

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upc);

        name = findViewById(R.id.fname);
        s_name = findViewById(R.id.sname);
        emaila = findViewById(R.id.email1);
        nameerror = findViewById(R.id.signcfirstnameerror);
        s_nameerror =findViewById(R.id.signcsurnameerror);
        emailaerror = findViewById(R.id.signcemialerror);
        upBtn = findViewById(R.id.upbtn);
        password = findViewById(R.id.signup_password);
        confirm_passowrd = findViewById(R.id.confirm_password);
        password_error = findViewById(R.id.password_error);
        confirm_password_error = findViewById(R.id.confirm_password_error);
        validSN = false;
        validFN = false;
        validEmail = false;
        validPassword = false;
        validConfirmPassword = false;
        matchPassword = false;

        back_btn = findViewById(R.id.back_arrow);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("users");
                    validNameFname();
                    validNameSname();
                    //validPass();
                    //validConPass();



        emaila.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(emaila.getText().toString()).matches()){
                    validEmail = true;
                    emailaerror.setVisibility(View.GONE);
                }else{
                    emailaerror.setText("Invalid email address");
                    emailaerror.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

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
                validPass();
            }
        });

        confirm_passowrd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validConPass();
            }
        });

        if(validConfirmPassword == validPassword){
            matchPassword = true;
        }


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signUpc.this, SignUpb.class);
                startActivity(intent);
                finish();
            }
        });


        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    validNameFname();
                    validNameSname();
                    validEmail();




                System.out.println(validFN + " " + validEmail + " " + validSN);
                    if(validSN && validFN && validEmail && matchPassword){
                        System.out.println("dddd");
                        Intent intent = new Intent(signUpc.this,com.example.unidriveprototype.view.class);
                        String user_email = emaila.getText().toString();
                        String user_password = password.getText().toString();
                        String firstName = name.getText().toString().trim();
                        String lastName = s_name.getText().toString().trim();

                        mAuth.createUserWithEmailAndPassword(user_email, user_password)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {

                                            FirebaseUser user = mAuth.getCurrentUser();
                                            if( user != null){
                                                saveUserInfoToDatabase(user.getUid(),firstName,lastName,user_email,user_password);
                                            }
                                            // Sign in success, update UI with the signed-in user's information
                                            //String userId = mAuth.getCurrentUser().getUid();
                                           // String userId = mDatabase.push().getKey();
                                            //User newUser = new User(firstName,lastName,user_email);
                                            //mDatabase.child(userId).setValue(newUser);
                                            //mDatabase.child("user").child(userId).setValue(newUser);
                                            //FirebaseUser user = mAuth.getCurrentUser();
                                            Toast.makeText(signUpc.this, "Success",
                                                    Toast.LENGTH_SHORT).show();
                                            startActivity(intent);
                                            finish();
                                        } else {
                                            // If sign in fails, display a message to the user.
                                            Toast.makeText(signUpc.this, "Authentication failed.",
                                                    Toast.LENGTH_SHORT).show();

                                        }
                                    }
                                });

                    }else{
                        System.out.println("ssss");
                    }





            }
        });

        /*if(validEmail + validFN + validSN == 3){
            System.out.println("naa true");
            nextIntent();
        }else{
            System.out.println("false");
        }*/



    }

    private void saveUserInfoToDatabase(String userId, String firstName, String lastName, String email, String password){
        DatabaseReference userRef = mDatabase.child("users").child(userId);
        User user = new User(firstName,lastName,email);
        userRef.setValue(user).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(signUpc.this, "Registration successful!", Toast.LENGTH_SHORT).show();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(signUpc.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });

    }

    private void validPass() {
        String passw = password.getText().toString();
        if(passw.isEmpty()){
            password_error.setText("Password can not be empty");
            password_error.setVisibility(View.VISIBLE);
        }else{
            if(passw.length() < 8){
                password_error.setText("Password should be 8 or more characters");
                password_error.setVisibility(View.VISIBLE);
            }else {
                validPassword = true;
                System.out.println(validPassword + " hello ");
                password_error.setVisibility(View.GONE);

            }
        }
    }

    private void validConPass(){
        String passc = confirm_passowrd.getText().toString();
        if(passc.isEmpty()){
            confirm_password_error.setText("Password can not be empty");
            confirm_password_error.setVisibility(View.VISIBLE);
        }else{
            if(passc.length() < 8 ){
                confirm_password_error.setText("Password should be 8 or more characters");
                //System.out.println(validConfirmPassword + " now ");
                confirm_password_error.setVisibility(View.VISIBLE);
            }else{
                validConfirmPassword = true;
                confirm_password_error.setVisibility(View.GONE);
            }
        }
    }


    private boolean isValidName(String uname) {
        if(uname.matches("^[a-zA-Z ]+$")){
            return true;
        }else {
            return false;
        }
    }

    private void validNameFname(){
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //System.out.println("nnnnn");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // String check_first_name = name.getText().toString().trim();
                //Boolean isNameF = check_first_name.isEmpty() && check_first_name.matches("^\\s*$");




            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!isValidName(name.getText().toString())) {
                    nameerror.setText("Invalid Firstname");
                    nameerror.setVisibility(View.VISIBLE);
                }

                else {
                    nameerror.setVisibility(View.GONE);
                    validFN = true;
                }

                if (name.getText().toString().trim().isEmpty() && name.getText().toString().trim().matches("^\\s*$")) {
                    nameerror.setText("Name cannot be empty");
                    name.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    private void validNameSname(){
        s_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!isValidName(s_name.getText().toString())){
                    s_nameerror.setText("Invalid Surname");
                    s_nameerror.setVisibility(View.VISIBLE);
                }else{
                    s_nameerror.setVisibility(View.GONE);
                    validSN = true;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

    }

    private void validEmail(){
        emaila.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(emaila.getText().toString()).matches()){
                    validEmail = true;
                    emailaerror.setVisibility(View.GONE);
                }else{
                    emailaerror.setText("Invalid email address");
                    emailaerror.setVisibility(View.VISIBLE);
                }
            }
        });

    }
    private  void nextIntent(){

    }

}