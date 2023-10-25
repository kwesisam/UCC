package com.example.unidriveprototype;

public class User {
    public String firstName;
    public String lastName;
    public String email;

    // Default constructor required for calls to DataSnapshot.getValue(User.class)


    public User(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }
}
