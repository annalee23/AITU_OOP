package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double topSpeed;

    public SportCar() {
        super();
    }
    public SportCar(String carBrand, String carClass, double weight, Driver driver, Engine typeMotor, double topSpeed) {
        super(carBrand, carClass, weight, driver, typeMotor);
        this.topSpeed = topSpeed;
    }
    public double getTopSpeed() {return topSpeed;}
    public void setTopSpeed(double topSpeed) {this.topSpeed = topSpeed;}

    public String toString() {
        return super.toString() + "\nSportCar: Top Speed - " + topSpeed + " km/h";
    }
}
