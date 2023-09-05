package com.example.testsring.ConstructorInjection;

import java.io.Serializable;

public class Student implements Serializable {

    private int zip;
    private int student_id;

    public Student() {
    }

    public Student(int zip, int student_id) {
        this.zip = zip;
        this.student_id = student_id;
        System.out.println("calling from cons: int ");
    }


    public Student(double zip, double student_id){
        this.zip = (int) zip;
        this.student_id = (int) student_id;
        System.out.println("calling from cons: double ");
    }


    public Student(String zip, String student_id){
        this.zip = Integer.parseInt(zip);
        this.student_id = Integer.parseInt(student_id);
        System.out.println("calling from string: ");
    }



    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "zip=" + zip +
                ", student_id=" + student_id +
                '}';
    }
}
