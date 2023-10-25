package com.example.unidriveprototype;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
public class BookRide extends AppCompatActivity {

    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private LocationManager locationManager;
    private LocationListener locationListener;
    private Button getLocationButton;
    private TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_ride);
 
        getLocationButton = findViewById(R.id.loc);
       //a = findViewById(R.id.hell);

        getLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("buuu");
                checkLocationPermission();
            }
        });
    }

    private void checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            // Location permission granted, proceed with location-related operations
            showLocationEnabledDialog();
        } else {
            // Location permission not granted, show a dialog to request permission
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    LOCATION_PERMISSION_REQUEST_CODE);
        }
    }

    private void showLocationEnabledDialog() {
        //LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        //boolean isLocationEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        boolean isGpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        if (isGpsEnabled) {
            // Location is already enabled, proceed with location-related operations
            // ...
            getLocation();
        } else {
            // Location is disabled, show a dialog to prompt the user to enable it
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enable Location")
                    .setMessage("Location access is required. Please enable location services.")
                    .setPositiveButton("Enable", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            openLocationSettings();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .setCancelable(false)
                    .show();
        }
    }

    private void openLocationSettings() {
        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Location permission granted, proceed with location-related operations
                showLocationEnabledDialog();
            } else {
                // Location permission denied, handle denial gracefully (e.g., show alternative options or instructions)
                showLocationPermissionDeniedDialog();
            }
        }
    }

    private void showLocationPermissionDeniedDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Permission Denied")
                .setMessage("Location permission is required to access your current location.")
                .setPositiveButton("Settings", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        openAppSettings();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setCancelable(false)
                .show();
    }

    private void openAppSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivity(intent);
    }
    private void getLocation() {
        // Code to retrieve the location
      /*  if (checkLocationPermissions()) {
            // Request location updates
            // ...
            // Once you have the location, log the latitude and longitude
            double latitude = 0.0; // Replace with actual latitude value
            double longitude = 0.0; // Replace with actual longitude value
            String location = "Latitude: " + latitude + "\nLongitude: " + longitude;
            a.setText(location);
        } else {
            requestLocationPermissions();
        }*/
        if (checkLocationPermissions()) {
            locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(@NonNull Location location) {
                    double latitude = location.getLatitude();
                    double longitude = location.getLongitude();
                    String locationStr = "Latitude: " + latitude + "\nLongitude: " + longitude;
                    a.setText(locationStr);
                }
                @Override
                public void onStatusChanged(String provider, int status, Bundle extras) {
                }

                @Override
                public void onProviderEnabled(String provider) {
                }

                @Override
                public void onProviderDisabled(String provider) {
                }
            };
            try {
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        } else {
            requestLocationPermissions();
        }


    }

    private boolean checkLocationPermissions() {
        int fineLocationPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int coarseLocationPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        return fineLocationPermission == PackageManager.PERMISSION_GRANTED
                && coarseLocationPermission == PackageManager.PERMISSION_GRANTED;
    }
    private void requestLocationPermissions() {
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
                LOCATION_PERMISSION_REQUEST_CODE);
    }

    protected void onStop() {
        super.onStop();
        if (locationManager != null && locationListener != null) {
            try {
                locationManager.removeUpdates(locationListener);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }
}


/*
*         loc_a = findViewById(R.id.loc);
        loc_nam = findViewById(R.id.loc_name);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        // Check if location permissions are granted
        getLocation();
        if (checkLocationPermissions()) {
            startLocationUpdates();
        } else {
            requestLocationPermissions();
        }

        /*loc_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("hello a button is clicked");
                //openMapSearch();

            }
        });*/

       /* setContentView(R.layout.activity_book_ride);
        mapView = new MapView(this);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);

        // Add the MapView to your layout

        LinearLayout layout = findViewById(R.id.map_layout);
        layout.addView(mapView);

    }
private boolean checkLocationPermissions() {
        int fineLocationPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        int coarseLocationPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION);
        return fineLocationPermission == PackageManager.PERMISSION_GRANTED
        && coarseLocationPermission == PackageManager.PERMISSION_GRANTED;
        }

private void requestLocationPermissions() {
        ActivityCompat.requestPermissions(this,
        new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION},
        LOCATION_PERMISSION_REQUEST_CODE);
        }
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        startLocationUpdates();
        } else {
        //Toast.makeText(this, "Location permissions denied", Toast.LENGTH_SHORT).show();
        showPermissionDeniedWithNeverAskAgainDialog();

        }
        }
        }

private void showPermissionDeniedWithNeverAskAgainDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Permission Denied")
        .setMessage("Location permission is required to fetch your current location. Please go to App Settings and grant the permission.")
        .setPositiveButton("App Settings", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
        openAppSettings();
        }
        })
        .setNegativeButton("Deny", new DialogInterface.OnClickListener() {
@Override
public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
        }
        })
        .setCancelable(false)
        .show();
        }
private void openAppSettings() {
        Intent intent = new Intent(Settings.ACTIVITY_SERVICE);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivity(intent);
        }
private void startLocationUpdates() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        locationRequest.setInterval(5000);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

           /* locationCallback = new LocationCallback() {
                public void onLocationResutl(LocationResult locationResult) {
                    if (locationResult == null) {
                        return;
                    }
                    for (Location location : locationResult.getLocations()) {
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        //loc_nam.setText(String.valueOf(latitude));
                        //loc_a.setText(String.valueOf(longitude));
                        System.out.println(String.valueOf(latitude));
                        System.out.println(String.valueOf(longitude));
                        a.setText(String.valueOf(latitude));
                        b.setText(String.valueOf(longitude));
                    }
                }
            };
        fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, null);
        } else {
        // Handle the case where location permissions are not granted
        Toast.makeText(this, "Location permissions not granted", Toast.LENGTH_SHORT).show();
        }



        //fusedLocationClient.requestLocationUpdates(locationRequest,locationCallback,null);

        }
private void getLocation() {
        if (checkLocationPermissions()) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        && ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

        fusedLocationClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
@Override
public void onSuccess(Location location) {
        if (location != null) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        a.setText(String.valueOf(latitude));
        b.setText(String.valueOf(longitude));
        } else {
        Toast.makeText(BookRide.this, "Location not available", Toast.LENGTH_SHORT).show();
        }
        }
        });
        } else {
        // Handle the case where location permissions are not granted
        Toast.makeText(this, "Location permissions not granted", Toast.LENGTH_SHORT).show();
        }

        } else{
        requestLocationPermissions();
        }
        }
protected void onStop() {
        super.onStop();
        // Stop location updates when the activity is stopped
        fusedLocationClient.removeLocationUpdates(locationCallback);
        }

   /* private void openMapSearch() {
        String locationName = loc_nam.getText().toString();

        if(!locationName.isEmpty()){
            Geocoder geocoder = new Geocoder(this);
            try{
                List<Address> addressList = geocoder.getFromLocationName(locationName,1);
                if(!addressList.isEmpty()){
                    Address address = addressList.get(0);
                    double latitude = address.getLatitude();
                    double longitude = address.getLongitude();
                    System.out.println(latitude);
                    System.out.println(longitude);
                }else{
                    Toast.makeText(this, "No results found for the location", Toast.LENGTH_SHORT).show();

                }
            } catch (IOException e) {
                e.printStackTrace();

                Toast.makeText(this, "Error in get Location. Please try again", Toast.LENGTH_SHORT).show();

            }
        }
    }*/

   /* @Override
         public void onMapReady(@NonNull GoogleMap googleMap) {

        googleMap = googleMap;

        LatLng userLocation = new LatLng(latitude,longitude);
        googleMap.addMarker(new MarkerOptions().position(userLocation).title("your postion"));

        LatLng destinationLocation = new LatLng(desLatitude,desLongitude);


    }*/