package ru.itmo.lessons.lesson14;

import java.util.Arrays;

public class PrimitiveWrapper {
    // byte - Byte, boolean - Boolean, int - Integer
    // long - Long, char - Character, double - Double
    // автоупаковка - переменной обертки присваивается значение примитива
    // автораспоковка - наоборот
    // автоупаковка не работает если примитив не соответствует типу
    // класса обертки
    // Byte byteObj = 500;

    private  static void print(Double[] doubles){
        System.out.println(Arrays.toString(doubles));
    }

    public static void main(String[] args) {


        byte one = 1;
      //  Integer integer = /*(int)*/one;

        Byte two = 2;
        int num = two;
        //
        double[] doubles = {45.8, 9.1};
      //  print(doubles);

        Integer x = 89;
        Integer y = 89;

        Integer a = 500;
        Integer b = 500;

        System.out.println(x == y); // true - потому что в пределах значения byte
        System.out.println(a==b); //false

    }
}
