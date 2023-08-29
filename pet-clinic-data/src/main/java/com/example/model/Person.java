package com.example.model;

public class Person {
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


}
