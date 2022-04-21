package ru.itmo.lessons.lesson13.bounded;

import ru.itmo.lessons.lesson13.bounded.Bicycle;
import ru.itmo.lessons.lesson13.bounded.Car;
import ru.itmo.lessons.lesson13.bounded.Train;
import ru.itmo.lessons.lesson13.bounded.Vehicle;

public class App {
    public static void main(String[] args) {
        Train train = (Train) Vehicle.getVehicle("train");
        System.out.println(train.getCarCount());

        Car car = (Car) Vehicle.getVehicle("car");
        System.out.println(car.getNum());

        Bicycle bike = (Bicycle) Vehicle.getVehicle("bike");
        System.out.println(bike.getType());

        Garage<Car> garage1 = new Garage<>();

        Garage<Vehicle> garage2 = new Garage<>();
    }
}