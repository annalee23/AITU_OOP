package com.company.professions;

public class Driver extends Person{
    private int drivingExperience;

    public Driver() {
        super();
    }
    public Driver(int age, String fullName, int drivingExperience) {
        super(age, fullName);
        this.drivingExperience = drivingExperience;
    }
    public int getDrivingExperience() {
        return drivingExperience;
    }
    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public String toString() {
        return "Driver: " + getFullName() + ", Driving Experience - " + drivingExperience + " years";
    }
}
