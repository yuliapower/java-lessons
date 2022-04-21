package ru.itmo.lessons.lesson13.methods;

public class UtilsApp {
    public static void main(String[] args) {
        String[] strings = {"w","f","t"};
        String string = "w";
        System.out.println(CustomUtils.inArray(strings,string));
        System.out.println(CustomUtils.<String>inArray(strings,"1"));

    Integer[] integers = {2,4,6};
    Integer integer = 34;
        System.out.println(CustomUtils.<Integer>inArray(integers,integer));

        System.out.println(CustomUtils.compareHashCode(12,12));
        System.out.println(CustomUtils.<Number,Integer>compareHashCode(12,12));
    }

}
