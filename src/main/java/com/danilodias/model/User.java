package com.danilodias.model;

public class User {
    private final String firstName;
    private final String email;
    private final String lastName;

    public User(String firstName, String email, String lastName) {
        this.firstName = firstName;
        this.email = email;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }
}
