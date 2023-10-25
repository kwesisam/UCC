package com.example.unidriveprototype;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
public class MainActivity extends Activity {

    private static int SPLASH_SEC = 5000;
    private static final int REQUEST_CODE_LOCATION_SETTINGS = 123;

    private FirebaseAuth mAuth;
   // private FirebaseUser user;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    //animation variable
    Animation topAnim, bottomAnim;

    //image and text variable
    ImageView image1;
    TextView text1, text2;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);// removing the wifi showing
        setContentView(R.layout.activity_unidrivep);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        image1 = findViewById(R.id.imageView);

        mAuth = FirebaseAuth.getInstance();
        //user = mAuth.getCurrentUser();
        //text1 = findViewById(R.id.textView2);
       // text2 = findViewById(R.id.textView3);

        image1.setAnimation(topAnim);
       // text1.setAnimation(bottomAnim);
        //text2.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent intent1 = new Intent(MainActivity.this, Homepage.class);
                //startActivity(intent1);
                mAuthStateListener = firebaseAuth -> {
                    FirebaseUser user = firebaseAuth.getCurrentUser();
                    if(user == null){
                        requestLocationSettings();
                        Intent intent = new Intent(MainActivity.this, view.class);
                        startActivity(intent);
                        finish(); // to end the program when the user click back button
                    }else{
                       Intent intent = new Intent(MainActivity.this, Homepage.class);
                        startActivity(intent);
                        finish();
                    }
                };
                mAuth.addAuthStateListener(mAuthStateListener);


            }
        },SPLASH_SEC);
    }

   /* @Override
    protected void onStart() {
        super.onStart();
        // Add the AuthStateListener when the activity starts
        mAuth.addAuthStateListener(mAuthStateListener);
    }*/

    @Override
    protected void onStop() {
        super.onStop();
        // Remove the AuthStateListener when the activity stops to avoid memory leaks
        if (mAuthStateListener != null) {
            mAuth.removeAuthStateListener(mAuthStateListener);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_LOCATION_SETTINGS) {
            // Check if user enabled location after being prompted
            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
            boolean isLocationEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            if (isLocationEnabled) {
                // Location services are now enabled
            } else {
                // User did not enable location
            }
        }
    }

    private void requestLocationSettings() {
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        if (locationManager != null) {
            boolean isGpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            boolean isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            if (isGpsEnabled || isNetworkEnabled) {
                // Location services are already enabled, move to the next activity
                moveToNextActivity();
            } else {
                // Location services are not enabled, prompt the user to enable them
                Intent settingsIntent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivityForResult(settingsIntent, REQUEST_CODE_LOCATION_SETTINGS);
            }
        } else {
            // Handle the case where LocationManager is not available
        }
    }

    private void moveToNextActivity() {
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(MainActivity.this, view.class);
            startActivity(intent);
            finish();
        } else {
            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);
            finish();
        }
    }
}
