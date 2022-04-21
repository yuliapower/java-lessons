package ru.itmo.lessons.lesson11;

public class Util {
    public static int max;
    public static int min;
    public final static double PI;
    //статический блок для инициализациии статических свойств (переменных)
    //инструкции выполняются один раз при загрузке класса
    //только статические свойства не равно статический класс, если бы это был статический класс,
    // то переж слово класс пишется статик
    static {
        PI = 3.14;
    }

    // private Util(){}

    // static метод нельзя переопределять в дочернем классе
    public static int random (int min, int max){
        // нельзя обратиться к не static свойствам и методам
        // нельзя обратиться к this
        // static метод (блок)
        return (int)(min+Math.random()*(max-min));
    }
}
