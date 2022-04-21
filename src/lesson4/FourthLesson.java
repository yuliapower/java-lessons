package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class FourthLesson {
    public static void main(String[] args) {
        //переменны обьявленные в цикле-работают только внутри цикла
        // примитивные типы данных
        // ссылочные типы данных
        /*
        int a =78; // [100] a
        int b = a; // [78] b
        a = 100;

        Scanner scanner = new Scanner(System.in); // in [scanner] scanner
        Scanner in = scanner;
        */
        int[] ints1 = new int[7];
        // int ints1[]
        // System.out.println(ints1); - так не надо [I@1b28cdfa
        System.out.println(Arrays.toString(ints1));
        int[] ints2 = {6, -90, 56, 12, 0, -44};
        System.out.println(Arrays.toString(ints2));
        ints2 = new int[3]; //[0, 0, 0]
        System.out.println(Arrays.toString(ints2));
        // ints2={34,78,12}; так нельзя
        ints2 = new int[]{34, 78, 12};
        //длина массива - положительное значение типа int
        int len = 10;
        int[] ints3 = new int[len];
        int[] ints4 = new int[len + 5];

        System.out.println(ints4.length); //15

        //доступ к элементам массива
        System.out.println(ints4[3]); //0
        ints4[2] = 56;
        System.out.println(Arrays.toString(ints4));
        // System.out.println(ints4[100]);  //ArrayIndexOutOfBoundsException
// многомерный массив
        //[ [0,0,0,0], [0,0,0,0], [0,0,0,0] ]
        int[][] ints5 = new int[3][4];
        //вывод многомерного массива в консоль
        System.out.println(Arrays.deepToString(ints5));
//[ [0,0], [0,0,36], [0,90,0,0] ]
        int[][] ints6 = new int[3][]; //[null, null, null]
        ints6[0] = new int[2]; //[[0,0], null, null]
        ints6[1] = new int[3]; //[[0,0], [0,0,0], null]
        ints6[2] = new int[4]; //[ [0,0], [0,0,0], [0,0,0,0] ]
        System.out.println(Arrays.deepToString(ints6));
        ints6[2][1] = 90;
        ints6[1][2] = 36;

        //for - если нужно изменить элементы массива, вместо одного положить другое значение
        int[] ints7 = {3, -6, 12, 0, 4};
        // 0  1  2  3  4
        //[3,-6,12, 0, 4]
        //for (int i = 0; i < ints7.length; i+=1) {
//ints7[i]*=ints7[i];
        // }

        //найти сумму значений элеменов массива ints7

        int sum = 0;
        for (int i = 0; i < ints7.length; i++) {  //(int i=ints7.length-1;  1--;)
            sum = sum + ints7[i];
        }
        System.out.println(sum);
//foreach: внутри него нельзя менять значения, не предоставляет доступа к индексам
        // проходит по всей длине массива
        //element - значения элементов массива
        for (int element : ints7) {
            System.out.println(element);
            sum += element;
        }
        //найти и вывести в консоль минимальное значение элемента массива ints8

        double[] ints8 = {3.7, -6.2, 12.9, 0.4, 4.1};
        double minValue = ints8[0];
        for (double element : ints8
        ) {
            if (minValue > element) minValue = element;
        }

        System.out.println(minValue);

    //вывести в консоль случайный элемент массива ints8
        System.out.println(ints8[(int)(Math.random()*ints8.length)]);


        //Arrays.sort(ints8);
        //System.out.println(Arrays.toString(ints8));
        int elem = Arrays.binarySearch(ints8, 3.7);
        System.out.println(elem); //0-место этого элемента выводит. если элемент в массиве не найден он возвращает отрицательное число
//по хорошему должен использоваться в отсортированном массиве
        double[] ints9 = {3.7, -6.2, 12.9, 0.4, 4.1};
        //double[] ints10 = ints9; - так копировать массывы нельзя. произойдет копирование ссылки одной области памяти
        double[]cloneInts9 = ints9.clone(); //вызываем метод клон
        //Arrays.copyOf()
        double[] copyInts9 = Arrays.copyOf(ints9,3);
        //3 - количество элементов которые надо скопировать
        System.out.println(Arrays.toString(copyInts9));
        double[] newDoubles = new double[10];
        System.arraycopy(ints9,1,newDoubles,3, 2);
        //1-из интс9 начиная с 1 индекса; в новый массив будут добавлятся начиная с индекса 3; 2 - количество элементов для копирования
        //[0, 0, 0, -6.2, 12.9, 0, 0...]
        System.out.println(Arrays.toString(newDoubles));
        //алгоритм быстрой сортировки - как работает метод сорт?
    }

    }

