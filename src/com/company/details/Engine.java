package com.company.details;

public class Engine {
    private int power;
    private String manufacturer;

    public Engine() {}
    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {return power;}
    public void setPower(int power) {this.power = power;}
    public String getManufacturer() {return manufacturer;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}

    @Override
    public String toString() {
        return "Engine: Power - " + power + ", Manufacturer - " + manufacturer;
    }

}
