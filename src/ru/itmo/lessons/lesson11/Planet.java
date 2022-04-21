package ru.itmo.lessons.lesson11;

public enum Planet {
    EARTH(6700, 40000), VENERA(5890, 56789), SATURN(1244,8555);

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }
    Planet(){}

    private int mass;
    private int radius;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
