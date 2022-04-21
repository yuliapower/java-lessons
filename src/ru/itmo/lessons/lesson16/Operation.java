package ru.itmo.lessons.lesson16;

@FunctionalInterface
public interface Operation {
     double execute(double a, double b);
     //если интерфейс содержит один абстрактный метод
    // и любое количество default или static методов такой интерфейс функциональный
}
