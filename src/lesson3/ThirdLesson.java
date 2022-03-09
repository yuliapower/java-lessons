package lesson3;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
        //Пользовательский ввод
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNum = in.nextInt();
        System.out.println(userNum + userNum);

       /* while (true) {    //boolean тип
            System.out.println("Введите целое положительное число" + "или 0 для выхода из программы");
            userNum = in.nextInt();
            if (userNum == 0)
                break; //только в циклах и в switch, завершение программы пишется в одной строчк с условием,а не на следующей
            if (userNum < 0)
                continue; //переход на следующую итерацию - то есть не выполняет следующую строчку, а возвращаются к true
            System.out.println(userNum * userNum);
        }

        */

       /* do {
            System.out.println("Введите целое положительное число" + "или 0 для выхода из программы");
     userNum = in.nextInt();
     if (userNum<0) continue;
            System.out.println(userNum*userNum);
        } while (userNum!=0);
*/


        /*
        int start = 10, end = 12;
        //вывести все четные числа от start до end
        // четное число %2 == 0
        // 2 4 6 8 10 12
        while (start <= end) {
            if (start%2==0) System.out.println(start);
            start+=1;
        }

         */

        //while (false) - не будет выполнять ни одной итерации
        // do {} while (true) - выполняет первую итерацию в любом случае (даже если условие не подходит)

        //for (инициализация переменных; булевое выражение (условие);обновление значений переменных )

      /*
        for (int start = 1,end=12;start<=end;start+=1){
            if (start%2==0) System.out.println(start);
        }



        for (int num=90;num >= 0;num-=5){
             System.out.println(num);
        }


        for (int count =0,num=2; count<10; count+=1,num+=2)
             System.out.println(num);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество тарелок");
        double dishes = in.nextInt();
        System.out.println("Введите количество моющего средства");
        double fairy = in.nextInt();

        while (fairy > 0 && dishes>0){
            dishes--;
            fairy -= 0.5;
            System.out.println(fairy);
        }
        System.out.println("Осталось тарелок "+dishes);
        System.out.println("Осталось моющего средства "+fairy);
    }


    }


