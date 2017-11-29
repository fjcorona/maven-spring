package com.mycompany.maven.spring.autowire;

// Create a POJO class Employee which has a 
// Address Object reference as instance variable
public class Employee {

    private String name;
    private int age;
    private Address address;

    public Employee(String name) {

        this.name = name;

    }

    public Employee(Address address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
