package ru.itmo.lessons.lesson11;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Article article1 = new Article("Путешествие по Австралии");
        article1.setCountry(Country.AUSTRALIA); //final static поэтому такой вызов
        System.out.println(article1.getCountry()); //AUSTRALIA

        Article article2 = new Article("Путешествие по Британии");
        article2.setCountry(Country.UK); //final static поэтому такой вызов
        System.out.println(article2.getCountry()); //UK

        // методы перечислений
        // получение массива констант
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries)); //[AUSTRALIA, UK, FRANCE]
        // индекс элемента перечисления в массиве
        System.out.println(Country.FRANCE.ordinal()); // 2
        for (Country country : countries) {
            System.out.println("country " + country.name()); //country AUSTRALIA
            //country UK
            //country FRANCE
        }

        //[AUSTRALIA, UK, FRANCE]
        // IllegalArgumentException, если элемент не будет найден
        Country country = Country.valueOf("UK");
        System.out.println(country); //UK

        Priority low = Priority.LOW;
        // Priority low2 = Priority.LOW;
        //Priority low3 = Priority.LOW; // три ссылки на объект
        System.out.println(low.getCode());

        low.setCode(2);
        System.out.println(low.getCode()); //2

        Priority[] priorities = Priority.values();
        for (Priority value : Priority.values()) {
            System.out.println(value.getCode());  //10 5 2
        }

        int sumRes = Operation.SUM.action(2, 3);
        System.out.println(sumRes);
        int multiRes = Operation.MULTI.action(2, 3);
        System.out.println(multiRes);

        Planet venera = Planet.VENERA;
        venera.setMass(4000);
        for (Planet value : Planet.values()) {
            System.out.println(value.name() + " " + value.getMass() + " " + value.getRadius());
        }
        // name - final поэтому его переопределить нльзя
        //toString переопределить можно,
        // хотя по умолчанию оба метода возвращают одно и то же значение
    }
}
