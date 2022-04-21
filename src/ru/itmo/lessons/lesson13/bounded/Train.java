package ru.itmo.lessons.lesson13.bounded;

import ru.itmo.lessons.lesson13.bounded.Vehicle;

public class Train extends Vehicle {
    private final int carCount;
    public Train(String color, String company, int condition, int carCount) {
        super(color, company, condition);
        this.carCount = carCount;
    }

    public int getCarCount() {
        return carCount;
    }

    @Override
    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("Поезд (количество вагонов " + carCount + " ) перекрашен");
    }
}