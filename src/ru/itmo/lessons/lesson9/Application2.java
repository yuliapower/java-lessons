package ru.itmo.lessons.lesson9;

import javax.swing.*;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        Point a = new Point(23, -12);//new point - вызов коснтруктора
        Point b = new Point(23, -12);
        System.out.println(a); //sout (a.toString());
        System.out.println(b);
        // сравнение ссылок
        System.out.println(a==b);//false

        //по умолчанию метод equals сравнивает ссылки
        // и должен быть переопределен в классе
        System.out.println(a.equals(b));

        // клонирование (метод clone())
        // у метода clone модификатор protected
        //метод нужно переопределить в классе point
        Point aClone = a.clone();
        System.out.println(a==aClone); //false
        System.out.println(a.equals(aClone)); //true


        Point c = new Point(12,33);
        Point d = new Point(45, 11);
        Point f = new Point(-8,-9);

        Figure figure1 = new Figure(3);
        figure1.addPoint(a);
        figure1.addPoint(b);
        figure1.addPoint(c);
        figure1.addPoint(d);
        figure1.addPoint(f);

        //Figure figure1Clone = figure1.clone();
       // System.out.println(figure1.equals(figure1Clone)); //true
        //System.out.println(figure1.getPoints()==figure1Clone.getPoints()); //false так как ссылки разные при клонировании создаются
        //System.out.println(Arrays.equals(figure1.getPoints(),figure1.getPoints())); //true
        //System.out.println(figure1.getPoints()[0]==figure1Clone.getPoints()[0]); //false
        //System.out.println(figure1.getPoints()[0].equals(figure1.getPoints()[0])); //true
    }
}
