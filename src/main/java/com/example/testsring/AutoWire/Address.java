package com.example.testsring.AutoWire;

import com.example.testsring.ObjectiInject.A;

public class Address {
    private String streetAddress;
    private Student student;


    public Address(String streetAddress, Student student) {

        this.streetAddress = streetAddress;
        this.student = student;
        System.out.println("calling from constructor: ");
    }


//    Address address = new Address();

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", student=" + student +
                '}';
    }
}
