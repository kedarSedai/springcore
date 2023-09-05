package com.example.testsring.AutoWire;

public class Address {
    private String streetAddress;
    private Student student;

    public Address(String streetAddress, Student student) {

        this.streetAddress = streetAddress;
        this.student = student;
        System.out.println("calling from constructor: ");
    }

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
