package ru.itmo.lessons.lesson20.serialization;

import java.util.Arrays;

public final class FigureCopy {
    private final PointCopy[] points; //final - не может ссылаться на другую ссылку,
    // сеттер тут не должно быть так как файнал, значения только при обьявлении массива либо в конструкторе

    public FigureCopy(int pointCount) {
        if (pointCount<2){
            throw new IllegalArgumentException("Фигура должна состоять минимум из 2 точек");
        }
        this.points = new PointCopy[pointCount];   //[null, null, null]
    }
    // метод добавления точки в массив
    // одинаковые точки в массив добавлять нельзя


    public PointCopy[] getPoints() {
        return points;
    }

    //метод добавления точки в массив
    // одинаковые точки в массив добавлять нельзя [p, p, p]
    public void addPoint(PointCopy point){
        for (int i = 0; i < points.length; i++) {
            if (points[i]!=null&&points[i].equals(point)){
                System.out.println("Точка с такими координатами уже есть");
                return;
            }
            if (points[i] == null) {
                points[i] = point;
                System.out.println("Точка "+point+" была добавлена.");
                return;
            }
        }
        System.out.println("Точка "+point+" не была добавлена. У  фигуры достаточное количество точек.");
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FigureCopy figure = (FigureCopy) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
