package ru.itmo.lessons.lesson9;
 //в одном файле может быть только один public class
// все классы в языке наследуются от класса Object
//implements Cloneable необходим, если происходит вызов метода
// clone родителя - Object, т.е super.clone()

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

     public int getX() {
         return x;
     }

     public void setX(int x) {   //сеттеры для того, чтобы в дальнейшем можно наследовать этот класс
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

    @Override
    public String toString() {
        return "Point{" +
                "значение x=" + x +
                ", значение y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //getClass
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() { //public вместо protected, Object на Point
       try {
           return (Point) super.clone();     //implements Cloneable - наверху добавляем чтоб здесь ссылаться на родительский клон из обджект
       } catch (CloneNotSupportedException e) {
           e.printStackTrace();
           return null;
       }
    }
}
