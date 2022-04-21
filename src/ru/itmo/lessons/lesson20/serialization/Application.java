package ru.itmo.lessons.lesson20.serialization;

import ru.itmo.lessons.lesson9.Figure;

public class Application {
    public static void main(String[] args) {
        PointCopy a = new PointCopy(45, 67);
        PointCopy b = new PointCopy(67, 12);
        PointCopy c = new PointCopy(89, -8);

        BinHandler binHandler = new BinHandler();
        binHandler.writeToFile(a);

        PointCopy aFromFile = binHandler.readFromFile();
        System.out.println(aFromFile.equals(a));

        FigureCopy figure = new FigureCopy(3);
        figure.addPoint(a);
        figure.addPoint(b);
        figure.addPoint(c);
        binHandler.writeToFile(figure);
        Figure figureFromFile = binHandler.readFromFile();
        System.out.println(figureFromFile);
    }

}
