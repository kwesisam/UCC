package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends Activity {

    private Button verify;
    private EditText phone;
    private TextView error;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        verify = findViewById(R.id.Vbtn);
        phone = findViewById(R.id.editPhone);
        error = findViewById(R.id.error);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, SignUpb.class);
                startActivity(intent);
            }
        });

       /* phone.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                System.out.println("dggdf");
                if(!hasFocus){
                    validatePhoneNumber(phone.getText().toString());
                }
            }


        });*/

        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!isValidNumber(phone.getText().toString())){
                    error.setText("Invalid phone number");
                    error.setVisibility(View.VISIBLE);
                }else{
                    verify.setVisibility(View.VISIBLE);
                    error.setVisibility(View.GONE);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });





      /*  phone = findViewById(R.id.editPhone);
        String countryCode = "+233";
        //phone.setText(countryCode);
        int maxlength = countryCode.length() + 10;


        InputFilter[] filters = {new InputFilter.LengthFilter(maxlength)};
        phone.setFilters(filters);

        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                String phoneNumber = editable.toString().substring(countryCode.length());

                if(phoneNumber.length() == 9 || phoneNumber.length() == 10){
                    verify.setVisibility(View.VISIBLE);

                }else{
                    error.setText("Invalid phone number");
                    error.setVisibility(View.VISIBLE);
                }
            }
        });*/
    }

    private boolean isValidNumber(String pNumber) {

        Pattern pat = Pattern.compile("^[+]?[0-9]{10,13}$");
        Matcher m = pat.matcher(pNumber);
        return m.matches();
    }

   /* private void validatePhoneNumber(String phone){
        if(!isValidNumber(phone)){
            error.setText("Invalid phone number");
            error.setVisibility(View.VISIBLE);
        }else{
            verify.setVisibility(View.VISIBLE);
        }
    }

    private boolean isValidNumber(String phone){
      /// String sanitizedPhoneNumber =  phone.replaceAll("[^0-9]", "");
      //  String phonePattern = "^[+]?[0-9]{10,13}$";

       // return Patterns.PHONE.matcher(sanitizedPhoneNumber).matches();
     //   if(phone.matches(phonePattern)){
       //     return true;
        //}// else{
         //   return false;
        //}

        return  phone.matches("\\d+");

    }
*/


}

    /*    String countryCode = "+233";
        userPhone.setText(countryCode);

        int maxlength = countryCode.length() + 10;
        InputFilter[] filters = {new InputFilter.LengthFilter(maxlength)};
        userPhone.setFilters(filters);

        userPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String phoneNumber = editable.toString().substring(countryCode.length());

                if(phoneNumber.length() == 9 || phoneNumber.length() == 10){
                    userPhoneNumberV.setVisibility(View.VISIBLE);

                }else{
                    userPhoneNumberE.setText("Invalid phone number");
                }
            }
        });

        userPhoneNumberV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, SignUpb.class);
                startActivity(intent);
            }
        });

*/


//  private TextView back2login, emailError, userFirstNameError, userLastNameError;
// private Button nextBtn;
// private EditText userEmail, userFirstName, userLastName;

    /*private EditText  userPhone= findViewById(R.id.userPhoneNumber);
    private TextView userPhoneNumberE = findViewById(R.id.userPhoneNumberError);
    private Button userPhoneNumberV = findViewById(R.id.userPhoneNumberVerify);*/