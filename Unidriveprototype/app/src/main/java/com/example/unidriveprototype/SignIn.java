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
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class SignIn extends Activity {
    private FirebaseAuth mAuth;
    private EditText password, email;
    private TextView password_error, email_error;
    private Button signin_btn;

    private static final String TAG = "SignIn";

    private Boolean validEmail = false;
    private Boolean validPassword = false;
    private ProgressBar progressBar;

    private String firstName, lastName, u_email;

   /* @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            //Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(SignIn.this, view.class);
            //startActivity(intent);
            //finish();

        }
    }*/
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        password = findViewById(R.id.signin_password);
        email = findViewById(R.id.signin_email);

        password_error = findViewById(R.id.signin_password_error);
        email_error = findViewById(R.id.signin_email_error);
        signin_btn =findViewById(R.id.signin_btn);

        progressBar = findViewById(R.id.progressBar);


        mAuth = FirebaseAuth.getInstance();


        /*Intent intent = getIntent();
        String toClose = intent.getStringExtra("toClose");
        System.out.println("sign in: " + toClose );
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(toClose.equals("close")){
;
        }else{
            if(currentUser != null){

;
            }
        }*/

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
                    validEmail = true;
                    email_error.setVisibility(View.GONE);
                }else{
                    email_error.setText("Invalid email address");
                    email_error.setVisibility(View.VISIBLE);
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

        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validEmail && validPassword){

                    //Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(SignIn.this, view.class);
                    //startActivity(intent);
                    //finish();
                    String user_email = email.getText().toString();
                    String user_password = password.getText().toString();
                    progressBar.setVisibility(View.VISIBLE);



                    mAuth.signInWithEmailAndPassword(user_email,user_password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        if(user != null){
                                            String user_id = user.getUid();
                                            //fetchUserDataFromDatabase(user_id);
                                            fetchUserDataFromDatabase(user_id);
                                            System.out.println(user_id);
                                            Toast.makeText(SignIn.this, "Welcome", Toast.LENGTH_SHORT).show();

                                            finish();
                                         }else{
                                            progressBar.setVisibility(View.GONE);

                                            Toast.makeText(SignIn.this, "Please signi", Toast.LENGTH_SHORT).show();
                                        }

                                    }else{
                                        progressBar.setVisibility(View.GONE);
                                        Toast.makeText(SignIn.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                    /*mAuth.signInWithEmailAndPassword(user_email, user_password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information



                                    } else {
                                        // If sign in fails, display a message to the user.


                                    }
                                }
                            });*/
                }
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
    private void fetchUserDataFromDatabase(final String userId) {
        DatabaseReference usersRef = FirebaseDatabase.getInstance().getReference("users").child("users").child(userId);
        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String firstName = snapshot.child("firstName").getValue(String.class);
                    String lastName = snapshot.child("lastName").getValue(String.class);

                    // Proceed with the retrieved first name and last name
                    Toast.makeText(SignIn.this, "Welcome, " + firstName + " " + lastName + "!", Toast.LENGTH_SHORT).show();

                    System.out.println(firstName + " " + lastName);

                    // Start the next activity and pass the data if needed
                    Intent intent = new Intent(SignIn.this, view.class);





                    Bundle args = new Bundle();
                    args.putString("firstName", firstName);
                    args.putString("lastName", lastName);
                    args.putString("email",email.getText().toString());
                    intent.putExtras(args);
                    startActivity(intent);

                } else {
                    Toast.makeText(SignIn.this, "User data not found.", Toast.LENGTH_SHORT).show();
                }
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Handle database error
                progressBar.setVisibility(View.GONE);
            }
        });
    }

   /* private void fetchUserDataFromDatabase(String userId){
        DatabaseReference usersRef = FirebaseDatabase.getInstance().getReference("users").child("users").child(userId);
        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                     firstName = snapshot.child("firstName").getValue(String.class);
                     lastName = snapshot.child("lastName").getValue(String.class);
                     u_email = snapshot.child("email").getValue(String.class);
                    Toast.makeText(SignIn.this, "Welcome, " + firstName + " " + lastName + "!", Toast.LENGTH_SHORT).show();
                    Bundle bundle = new Bundle();
                    bundle.putString("firstName", firstName);
                    bundle.putString("lastName", lastName);
                    bundle.putString("email", u_email);

                    // Create an instance of Fragment F4
                    F4 fragment = new F4();
                    // Set the arguments for the fragment
                    fragment.setArguments(bundle);

                }else{
                    Toast.makeText(SignIn.this, "User data not found.", Toast.LENGTH_SHORT).show();
                    System.out.println(snapshot);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                //Log.e("TAG", "Error retrieving data: " + databaseError.getMessage());

            }
        });
    }*/

   /* private void fetchUserDataFromDatabase(final String inputEmail, final String inputPassword) {
        DatabaseReference usersRef = FirebaseDatabase.getInstance().getReference("users").child("users");
        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean userFound = false;
                for (DataSnapshot userSnapshot : snapshot.getChildren()) {
                    String storedEmail = userSnapshot.child("email").getValue(String.class);
                    if (inputEmail.equals(storedEmail)) {
                        userFound = true;
                        String storedPassword = userSnapshot.child("password").getValue(String.class);
                        if (inputPassword.equals(storedPassword)) {
                            // Password matches, proceed to next activity
                            firstName = userSnapshot.child("firstName").getValue(String.class);
                            lastName = userSnapshot.child("lastName").getValue(String.class);
                            u_email = storedEmail; // Use the stored email

                            Toast.makeText(SignIn.this, "Welcome, " + firstName + " " + lastName + "!", Toast.LENGTH_SHORT).show();
                            Bundle bundle = new Bundle();
                            bundle.putString("firstName", firstName);
                            bundle.putString("lastName", lastName);
                            bundle.putString("email", u_email);

                            // Create an instance of Fragment F4
                            F4 fragment = new F4();
                            // Set the arguments for the fragment
                            fragment.setArguments(bundle);


                        } else {
                            // Password doesn't match
                            Toast.makeText(SignIn.this, "Invalid password.", Toast.LENGTH_SHORT).show();
                        }
                        break; // Exit the loop since user is found
                    }
                }
                progressBar.setVisibility(View.GONE);

                if (!userFound) {
                    // User not found
                    Toast.makeText(SignIn.this, "User not found.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignIn.this, firstName + " " + lastName + " " + u_email, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignIn.this, view.class);
                    startActivity(intent);
                    finish();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Handle database error
            }
        });
    }*/




}