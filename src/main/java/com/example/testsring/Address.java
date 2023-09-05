package com.example.testsring;

import com.example.testsring.ObjectiInject.A;

public class Address {

    private String name;
    private String zip;


    public Address(String name, String zip) {
        this.name = name;
        this.zip = zip;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public static void main(String[] args) {
        Address address = new Address("q2w","12");
        address.setZip("12");

    }
}
