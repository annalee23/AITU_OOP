package com.company.professions;

public class Person {
    private int age;
    private String fullName;

    public Person() {}
    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public String toString() {
        return "Full name: " + fullName + ", Age: " + age;
    }
}
