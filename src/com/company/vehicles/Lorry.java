package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double carryingCapacity;

    public Lorry() {
        super();
    }
    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine typeMotor, double carryingCapacity) {
        super(carBrand, carClass, weight, driver, typeMotor);
        this.carryingCapacity = carryingCapacity;
    }
    public String toString() {
        return super.toString() + "\nLorry: Carrying capacity - " +
                carryingCapacity + " tons";
    }
}
