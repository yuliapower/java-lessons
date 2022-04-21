package ru.itmo.lessons.lesson20.serialization;

import java.io.*;
import java.util.Objects;

public class PointCopy implements Serializable {
    //@Serial //since: 14
    private static final long serialVersionUID = 1L;
    private int x;
    private int y;

    //пустой конструктор для экстералайзибла
    public PointCopy(){}

    public PointCopy(int x, int y){
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


    public void writeExternal(ObjectOutput out) throws IOException {
        out.write(x);
        out.write(y);
    }

   // @Override
   // public void readExternal(ObjectInput in) throws IOException{
   //     in.read(x);
   //     in.read(y);
   // }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //getClass
        PointCopy point = (PointCopy) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


}
