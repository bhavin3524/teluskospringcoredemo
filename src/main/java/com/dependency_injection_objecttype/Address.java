package com.dependency_injection_objecttype;

public class Address {
    private int pincode;
    private String streetName;

    public Address() {
    }

    public Address(int pincode, String streetName) {
        this.pincode = pincode;
        this.streetName = streetName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
