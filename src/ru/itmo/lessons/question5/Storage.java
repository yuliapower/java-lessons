package ru.itmo.lessons.question5;

import java.util.Arrays;

public class Storage {
    private String[] strings;
    private int lastIndex;

    public Storage(int len) {
        if (len < 1) {
            throw new IllegalArgumentException("Задайте размер массива");
        }
        strings = new String[len];
    }

    public void addString(String newString) {
        if (lastIndex==strings.length){
            System.out.println("Нет места");
            return;
        }
        strings[lastIndex]=newString;
        lastIndex++;

    }

    @Override
    public String toString() {
        return "Storage{" +
                "strings=" + Arrays.toString(strings) +
                '}';
    }
}
