package com.example.unidriveprototype;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class signupb extends AppCompatActivity {

    String firstName, lastName, emaila, phoneNum, InNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupb);

        /*
        * args.putString("firsname", first_name );
                args.putString("lastName", last_name);
                args.putString("email",emaila);
                args.putString("phone", phonen);
                args.putString("linNum", licencenumber);
                args.putString("RegNum", vecNumber);
                args.putString("MM", model_make);
                args.putString("InComName", insurancecom );
                args.putString("PNum", policy );
                args.putString("email",email.getText().toString());
                *                 args.putString("DateOfBirth0", dateofbirth);
                args.putString("LinExpDate", licenseexpirydate);
                args.putString("ManufactureDate",manufactDate);
                args.putString("InsuranceDate", insuranceExp);
        * */
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){


        }
        //mAuth = FirebaseAuth.getInstance();
       // mDatabase = FirebaseDatabase.getInstance().getReference().child("users");
    }
}