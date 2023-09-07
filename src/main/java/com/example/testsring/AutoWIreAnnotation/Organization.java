package com.example.testsring.AutoWIreAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Organization {


    private int org_id;
    @Autowired
    private Employee employee;


    @Autowired
    public Organization(int org_id, Employee employee) {
        this.org_id = org_id;
        this.employee = employee;
        System.out.println("calling from constructor: ");
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
        System.out.println("calling from setter: ");
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
        System.out.println("calling from setter: ");
    }

    @Override
    public String toString() {
        return "Organization{" +
                "org_id=" + org_id +
                ", employee=" + employee +
                '}';
    }
}
