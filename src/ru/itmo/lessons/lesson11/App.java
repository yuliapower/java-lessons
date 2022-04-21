package ru.itmo.lessons.lesson11;

public class App {
    public static void main(String[] args) {
        Util util1 = new Util(); // -
        Util util2 = new Util(); // -

        util1.max = 1200; //некорректно так вызывать
        System.out.println(util2.min); //некорректно так вызывать

        Util.max = 100;
        Util.min =200; //кооректный вызов

        System.out.println(util2.max); // -
        System.out.println(util1.min); // -

        System.out.println(Util.PI);
        System.out.println(Util.random(2,67));
        Planet planet = Planet.VENERA;
        System.out.println();
    }
}
