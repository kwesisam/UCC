package com.example.unidriveprototype;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * A simple {@link //Fragment} subclass.
 * Use the {@link //F4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class F4 extends Fragment {
    private FirebaseFirestore firestore;
    private FirebaseAuth auth;

    private LinearLayout logout;
    private TextView username, u_email ;

    private String userl, userf, usere;

    public F4(String a, String b, String c){
        userf  = a;
        userl = b;
        usere = c;
    }
    //private DatabaseReference mDatabase;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f4, container, false);
        logout = view.findViewById(R.id.fragment_settings);

        System.out.println(userf + " "  +userl + " " + usere );

        username = view.findViewById(R.id.user_full_name);
        u_email = view.findViewById(R.id.user_email);
        username.setText(userf + " " + userl);
        u_email.setText(usere);

//------ retrieving user infromation
       Bundle args = getArguments();
        System.out.println(args);
        if (args != null) {
            String firstName = args.getString("firstName");
            String lastName = args.getString("lastName");
            String email = args.getString("email");

            // Now you can use these values in your fragment UI
            // For example, set the text of a TextView
            System.out.println(lastName + " " +  firstName + " " + email);

            // ... (other UI updates)
        }else{
            System.out.println("cannot display user");
        }
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Settings.class);
                startActivity(intent);
                getActivity().finishAffinity();
            }
        });

        firestore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();
       FirebaseUser currentUser = auth.getCurrentUser();
        System.out.println(currentUser);
        /*if (currentUser != null) {
            String userId = currentUser.getUid();

            firestore.collection("users")
                    .document(userId).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                            if(task.isSuccessful()){
                                DocumentSnapshot document = task.getResult();
                                if(document.exists()){
                                    String firstname = document.getString("firstname");
                                    String lastname = document.getString("lastname");
                                    String email = document.getString("email");
                                    System.out.println(firstname + " " + lastname + " " + email + " framg");
                                }else{
                                    System.out.println("user does not exists");
                                }
                            }else{
                                Exception exception = task.getException();
                                if (exception instanceof FirebaseFirestoreException) {
                                    // Handle Firestore exception
                                } else {
                                    // Handle other exceptions
                                }
                            }
                        }
                    });

// ---  retrieving user information


            // ... (rest of your code)
        } else {

            Toast.makeText(getActivity(), "Naah Login first", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), SignIn.class);
            startActivity(intent);
            getActivity().finishAffinity();
        }
       // String userId = auth.getCurrentUser().getUid();




       // Bundle args = getArguments();

        if( args != null){
            String lastName = args.getString("lastName");
            surname.setText("Hi " + lastName);
        }

;*/
       /* FirebaseApp.initializeApp(getActivity());
        mDatabase = FirebaseDatabase.getInstance().getReference("users").child("users");
        surname = view.findViewById(R.id.setting_lastname);

        mDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String lastName = snapshot.child("lastName").getValue(String.class);
                    surname.setText("Hi " + lastName);
                }else{
                    Toast.makeText(getActivity(), "User data not found.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/


        return view;
    }

}