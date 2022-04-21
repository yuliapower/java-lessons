package ru.itmo.lessons.lesson13.methods;

public class CustomUtils {
    // типизированные методы (generic methods)
    // метод, который проверяет наличие элемента в массиве
    public static <T> boolean inArray(T[]arr,T element){
        if (arr==null||element==null){
            throw new IllegalArgumentException("arr и element не могут быть null");
        }
        for (T t:arr){
            if (element.equals(t)) return true;
        }
        return false;
    }
    // неизвестный тип данных - можно вызвать методы класса Object
    // T не может быть типом примитивным

    public static <T extends Number, K extends Integer> int compareHashCode(T first, K second){
            return Integer.compare(first.hashCode(),second.hashCode());
    }
    // если метод на вход и выход имеет разные типы - то используем несколько букв
    //при вызове Т может быть Number и любым из его родителей (обджект )
    //при вызове К может быть Integer и любым из его родителей (обджект )
    // у first можно вызвать методы  Number и его родителей
    // у second можно вызвать методы  Number и его родителей
}

