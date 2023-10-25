package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signupa extends AppCompatActivity {

    Button signupa_next;
    EditText firstName, lastName, dateOfBirth, phone, email, licenseNumber, licenseExpiryDate, vehicleRegistrationNumber, modelandmake, manufactureDate, insuranceCompanyName, policyNumber, insuranceExpirationDate;
    RadioGroup gender;
    String selectedOption;
    CalendarView calenderView;
    String selectedDate;
    Boolean validFname, validLname, validPhone, validEmail, validLinNumber, validReg, validMM, validInsComName, validPNum;
    TextView firstnameerror, lastnameerror, dateofbirtherror, gendererror, phoneerror, emailerror, licensenumbererror, licenseexpirydateerror, vechichregistrationerror, makeandmodelerror, manufactureerror, insurancecompanynameerror, policynumbererror, insuranceexpiryerror;
     Boolean validlinexp;
     Boolean validateofbirth;
     Boolean validlindate;
     Boolean validmau;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupa);
        signupa_next = findViewById(R.id.signupa_next);
        firstName = findViewById(R.id.editTextFirstName);
        firstnameerror = findViewById(R.id.signupa_firstnameerror);
        lastName = findViewById(R.id.editTextLastName);
        lastnameerror = findViewById(R.id.signupa_lastnameerror);
        dateOfBirth = findViewById(R.id.editTextDateOfBirth);
        dateofbirtherror = findViewById(R.id.signupa_birthdayerror);
        gender = findViewById(R.id.radioGroupGender);
        gendererror = findViewById(R.id.signupa_gendererror);
        phone = findViewById(R.id.editTextPhoneNumber);
        phoneerror = findViewById(R.id.signupa_phoneerror);
        email = findViewById(R.id.editTextEmailAddress);
        emailerror = findViewById(R.id.signupa_emailerror);
        licenseNumber = findViewById(R.id.editTextLicenseNumber);
        licensenumbererror = findViewById(R.id.sigupa_licenseerror);
        licenseExpiryDate = findViewById(R.id.editTextExpiryDate);
        licenseexpirydateerror = findViewById(R.id.signupa_insuranceexpiryerror);
        vehicleRegistrationNumber = findViewById(R.id.editTextVehicleRegistrationNumber);
        vechichregistrationerror = findViewById(R.id.signupa_registrationnumbererror);
        modelandmake = findViewById(R.id.editTextVehicleMakeModel);
        makeandmodelerror = findViewById(R.id.signupa_makeandmodelerror);
        manufactureDate = findViewById(R.id.signupa_yearofmanufacture);
        manufactureerror = findViewById(R.id.signupa_manufacturedateerror);
        insuranceCompanyName = findViewById(R.id.editTextInsuranceCompany);
        insurancecompanynameerror = findViewById(R.id.signupa_insurancenameerror);
        policyNumber = findViewById(R.id.editTextPolicyNumber);
        policynumbererror = findViewById(R.id.signupa_policynumbererror);
        insuranceExpirationDate = findViewById(R.id.editTextInsuranceExpiryDate);
        insuranceexpiryerror = findViewById(R.id.signupa_insuranceexpiryerror);

        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checck) {
                RadioButton selectedRadioButton = findViewById(checck);
                selectedOption = selectedRadioButton.getText().toString();
            }
        });



        System.out.println(selectedDate);

        firstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validateFName(firstName.getText().toString());

            }
        });

        lastName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validateLName(lastName.getText().toString());

            }
        });

        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validPhone(phone.getText().toString());
            }
        });

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


        licenseNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validLicenceNumber();
            }
        });

        vehicleRegistrationNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validRegistration();
            }
        });


        modelandmake.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validMakeAndModel();
            }
        });

        insuranceCompanyName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validInsuranceName();
            }
        });

        policyNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validPolicyNumber();
            }
        });

        licenseExpiryDate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                validLinDate(licenseExpiryDate.getText().toString());
            }
        });

        dateOfBirth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                    validDateofBirth(dateOfBirth.getText().toString());
            }
        });

        manufactureDate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                    validManuDate(manufactureDate.getText().toString());
            }
        });
        insuranceExpirationDate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                    validLinExp(insuranceExpirationDate.getText().toString());
            }
        });

        System.out.println(validFname + " " + validLname);
        signupa_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  policyName, insuranceExpirationDate;
                String first_name = firstName.getText().toString();
                System.out.println(first_name);
                String last_name = lastName.getText().toString();
                System.out.println(last_name);
                String dateofbirth = dateOfBirth.getText().toString();
                System.out.println(dateofbirth);
                String phonen = phone.getText().toString();
                System.out.println(phonen);
                String emaila = email.getText().toString();
                System.out.println(emaila);
                String licencenumber = licenseNumber.getText().toString();
                System.out.println(licencenumber);
                String licenseexpirydate = licenseExpiryDate.getText().toString();
                System.out.println(licenseexpirydate);
                String vecNumber = vehicleRegistrationNumber.getText().toString();
                System.out.println(vecNumber);
                String model_make = modelandmake.getText().toString();
                System.out.println(model_make);
                String manufactDate = manufactureDate.getText().toString();
                System.out.println(manufactDate);
                String insurancecom = insuranceCompanyName.getText().toString();
                System.out.println(insurancecom);
                String policy = policyNumber.getText().toString();
                System.out.println(policy);
                String insuranceExp = insuranceExpirationDate.getText().toString();
                System.out.println(insuranceExp);

               // Boolean validFname, validLname, validPhone, validEmail, validLinNumber, validReg, validMM, validInsComName, validPNum;
                Intent intent = new Intent(signupa.this, signupb.class);
                Bundle args = new Bundle();
                args.putString("firsname", first_name );
                args.putString("lastName", last_name);
                args.putString("email",emaila);
                args.putString("phone", phonen);
                args.putString("linNum", licencenumber);
                args.putString("RegNum", vecNumber);
                args.putString("MM", model_make);
                args.putString("InComName", insurancecom );
                args.putString("PNum", policy );
                args.putString("DateOfBirth0", dateofbirth);
                args.putString("LinExpDate", licenseexpirydate);
                args.putString("ManufactureDate",manufactDate);
                args.putString("InsuranceDate", insuranceExp);
                System.out.println(args);
                intent.putExtras(args);

                startActivity(intent);

                //Boolean ;
               // Boolean ;
                if(validFname && validLname && validPhone && validEmail && validLinNumber && validReg && validMM && validInsComName && validPNum && validlinexp  && validateofbirth && validlindate && validmau){
                }

                finish();
            }
        });

    }

    private void validLinExp(String input) {
        if(dateYear(input)){
            insuranceexpiryerror.setVisibility(View.GONE);
            validlinexp = true;
        } else if (input.isEmpty()) {
            insuranceexpiryerror.setVisibility(View.VISIBLE);
            insuranceexpiryerror.setText("This feild cannot be empty");
        }else{
            insuranceexpiryerror.setText("Invalid input");
            insuranceexpiryerror.setVisibility(View.VISIBLE);

        }

    }

    private void validManuDate(String input) {
        if(dateYear(input)){
            manufactureerror.setVisibility(View.GONE);
            validmau = true;
        } else if (input.isEmpty()) {
            manufactureerror.setVisibility(View.VISIBLE);
            manufactureerror.setText("This field cannot be empty");
        }else{
            manufactureerror.setVisibility(View.VISIBLE);
            manufactureerror.setText("Invalid Input");
        }
    }

    private void validLinDate(String input){
        if(dateValid(input)){
            licensenumbererror.setVisibility(View.GONE);
            validlindate = true;
        }else if(input.isEmpty()){
            licensenumbererror.setVisibility(View.VISIBLE);
            licensenumbererror.setText("This field cannot be empty");
        }else{
            licensenumbererror.setVisibility(View.VISIBLE);
            licensenumbererror.setText("Invalid input");
        }
    }

    public void validDateofBirth(String input){
        if(dateValid(input)){
            dateofbirtherror.setVisibility(View.GONE);
            validateofbirth = true;
        }else if(input.isEmpty()){
            dateofbirtherror.setVisibility(View.VISIBLE);
            dateofbirtherror.setText("This field cannot be empty");
        }else{
            dateofbirtherror.setText("Invalid input");
            dateofbirtherror.setVisibility(View.VISIBLE);
        }
    }
    private boolean dateValid(String input){
        String pat = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(input);
        return  matcher.matches();
    }

    private boolean dateYear(String input){
        String pat = "^[0-9]{4}$";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(input);
        return  matcher.matches();
    }

    private void validateFName(String name) {
        if(name.matches("^[a-zA-Z ]+$")){
            firstnameerror.setVisibility(View.GONE);
            validFname = true;
        }else {
            firstnameerror.setVisibility(View.VISIBLE);
            if(name.isEmpty()){
                firstnameerror.setText("Field is required");
            }else{
                firstnameerror.setText("Invalid Name");

                validFname = false;
            }
        }

    }

    private void  validateLName(String name){
        if(name.matches("^[a-zA-Z ]+$")){
            lastnameerror.setVisibility(View.GONE);
            validLname = true;
        }else{
            lastnameerror.setVisibility(View.VISIBLE);
            if(name.isEmpty()){
                lastnameerror.setText("Field is required");
            }else{
                lastnameerror.setText("Invalid Name");
            }
            validLname = false;
        }
    }

    public void validPhone(String phone){
        Pattern pat = Pattern.compile("^[+]?[0-9]{10}$");
        Matcher m = pat.matcher(phone);
         if(m.matches()){
             validPhone = true;
             phoneerror.setVisibility(View.GONE);
        }else{
             if(phone.isEmpty()){
               phoneerror.setText("This field cannot be empty");
               phoneerror.setVisibility(View.VISIBLE);
             }else {
                 phoneerror.setText("Invalid phone number");
                 phoneerror.setVisibility(View.VISIBLE);
             }
         }
    }

    public void validEmail(){
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
            validEmail = true;
            emailerror.setVisibility(View.GONE);
        }else{
            emailerror.setText("Invalid email");
            emailerror.setVisibility(View.VISIBLE);
        }
    }

    public void validLicenceNumber(){
        String ln = licenseNumber.getText().toString();
        if(ln.isEmpty()){
            licensenumbererror.setVisibility(View.VISIBLE);
            licensenumbererror.setText("This field cannot be empty");
        }else{
            licensenumbererror.setVisibility(View.GONE);
            validLinNumber = true;
        }
    }

    public void validRegistration(){
        String r = vehicleRegistrationNumber.getText().toString();
        if(r.isEmpty()){
            vechichregistrationerror.setText("This field cannot be emptyr");
            vechichregistrationerror.setVisibility(View.VISIBLE);
        }else{
            vechichregistrationerror.setVisibility(View.GONE);
            validReg = true;
        }
    }

    public void validMakeAndModel(){
        String mm = modelandmake.getText().toString();
        if(mm.isEmpty()){
            makeandmodelerror.setText("This field cannot be empty");
            makeandmodelerror.setVisibility(View.VISIBLE);
        }else{
            makeandmodelerror.setVisibility(View.GONE);
            validMM = true;
        }
    }

    public void validInsuranceName(){
        String is = insuranceCompanyName.getText().toString();
        if(is.matches("^[a-zA-Z ]+$")){
            insurancecompanynameerror.setVisibility(View.GONE);
            //Boolean validFname, validLname, validPhone, validEmail, validLinNumber, validReg, validMM, validInsComName, validPNum;
            validInsComName = true;
        }else{
            if(is.isEmpty()){
                insurancecompanynameerror.setText("This field cannot be empty");
                insurancecompanynameerror.setVisibility(View.VISIBLE);
            }else{
                insurancecompanynameerror.setText("Invalid Company Name");
                insurancecompanynameerror.setVisibility(View.VISIBLE);
            }

        }
    }

    public void validPolicyNumber(){
        String pn = policyNumber.getText().toString();

        if(pn.isEmpty()){
            policynumbererror.setText("This field cannot be empty");
            policynumbererror.setVisibility(View.VISIBLE);
        }else{
            policynumbererror.setVisibility(View.GONE);
            //
            validPNum = true;
        }
    }


}
/*

                    *
                    *
* */