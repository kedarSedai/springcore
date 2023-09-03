package com.example.testsring.CollectionInjection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    // set, map, list,

    private List<String> address;
    private Set<String> city;
    private Map<String, String>  college;


    public Map<String, String> getCollege() {
        return college;
    }

    public void setCollege(Map<String, String> college) {
        this.college = college;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", city=" + city +
                ", college=" + college +
                '}';
    }
}
