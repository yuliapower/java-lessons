package ru.itmo.lessons.lesson16;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void run(Operation some, double x, double y){
        double res = some.execute(x, y);
        System.out.println("Результат: "+res);
    }
    public static void main(String[] args) {

        //public interface Operation {
        //     double execute(double a, double b);}
        //реализация абстрактно метода
        Operation plus = (first, second) -> /*return*/ first + second;
        Operation div = (first, second) -> {
            if (second==0) return 0;
            return first/second;
        };
        //если метод принимает на вход 1 аргумент,
        // круглые скобки можно не ставить
        // тип данных можно не указывать, они берутся из контекста,
        // из интерфейса
        // если тело метода состоит из одной инструкции
        // фигурные скобки можно не ставить
        //return если хотим вернуть что-то из метода
        System.out.println(plus.execute(34,78));
        System.out.println(div.execute(45,1));

        run(plus, 5.7, 5.2);

        // interface Predicate
        // реализация метода test
        //проверка на положительное число
        Predicate<Integer> positive = x -> x>0;
//проверка на отрицатеьное число
        Predicate<Integer> negative = x -> x<0;
//-проверка на четное число
        Predicate<Integer> even = x -> x%2==0;
        System.out.println(positive.test(-67)); //false

        System.out.println(positive.and(even).test(68));
        System.out.println(positive.or(negative).test(0));

        //Function
        //apply
        //уменшение целого числа на 20%
        //увеличение числа в два раза
        //добавление к положительному числу символов "р."
//    R apply(T t);
        Function <Integer,Double> minus20 = x -> x*0.8;
        Function <Integer,Integer> doubled = x -> x*2;
        Function <Integer,String> str = x -> x+"p.";
        System.out.println(doubled.andThen(str).apply(45)); //90p.
    }
}
