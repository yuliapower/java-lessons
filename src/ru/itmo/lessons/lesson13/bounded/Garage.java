package ru.itmo.lessons.lesson13.bounded;
// T extends Vehicle - T может быть Vehicle и его наследники Car Train Bicycle
// у vehicle можно вызвть методы Vehicle
// T extends Vehicle - T
//
public class Garage<T extends Vehicle> {
private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }


}