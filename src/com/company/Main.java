package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
            Driver driver = new Driver(25,"John Doe", 5);
            Engine engine = new Engine(200, "Toyota");
            Car car = new Car("Toyota Camry", "Sedan", 1500, driver, engine);

            Lorry lorry = new Lorry("Volvo", "Truck", 5000, driver, engine, 10.5);
            SportCar sportCar = new SportCar("Ferrari", "Sports Car", 1200, driver, engine, 300);

            System.out.println(car.toString());
            System.out.println();
            System.out.println(lorry.toString());
            System.out.println();
            System.out.println(sportCar.toString());

    }
}
