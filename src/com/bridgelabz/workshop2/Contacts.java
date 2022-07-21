package com.bridgelabz.workshop2;

public class Contacts {

   private String firstName;
   private String secondName;
   private String city;
   private  String state;
   private int pinCode;
   private long phoneNumber;
   private String email;

    public Contacts(String firstName, String secondName, String city, String state, int pinCode, long phoneNumber, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contacts() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

}
