package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine typeMotor;

    public Car() {}
    public Car(String carBrand, String carClass, double weight, Driver driver, Engine typeMotor) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.typeMotor = typeMotor;
    }

    public String getCarBrand() {return carBrand;}
    public void setCarBrand(String carBrand) {this.carBrand = carBrand;}
    public String getCarClass() {return carClass;}
    public void setCarClass(String carClass) {this.carClass = carClass;}
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    public Driver getDriver() {return driver;}
    public void setDriver(Driver driver) {this.driver = driver;}
    public Engine getTypeMotor() {return typeMotor;}
    public void setTypeMotor(Engine typeMotor) {this.typeMotor = typeMotor;}

    public void start() {
        System.out.println("Let's go!");
    }
    public void stop() {
        System.out.println("Let's stop!");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    @Override
    public String toString() {
        return "Car: Brand - " + carBrand + ", Class - " + carClass +
                ", Weight - " + weight + "\n" + driver + "\n" + typeMotor;
    }

}
