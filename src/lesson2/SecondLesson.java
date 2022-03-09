package lesson2;

public class SecondLesson {
    public static void main(String[] args) {
        //логические операторы - всегда возвращают тип булен
        //оператор "и" &&
        int x = 50, y = 100, z = 91;
        boolean res = (x % 2 == 0) && (y % 2 == 0) && (z % 2 == 0);
        //             true      true     false
        //             true      false
        //false
        System.out.println(res);

        res = (x < z) && (y > z);
        System.out.println(res);  //true
        //res= (x<z) < y;   = false<y   - нельзя

        //оператор или ||
        int code = 3333, age = 34;
        res = (code == 2222) || (code == 3333) || (code == 4444);

        // ! оператор "не" - меняет значение на противоположное
        System.out.println(!res);   //true

        boolean isActive = false, isConnected = true;
        res = !isActive || !isConnected;
        System.out.println(res);   //true
        res = !((code != 3333) || (age < 18));
        System.out.println(res); //true

        /*
        if (boolean выражение) {
            инструкции
       } else {
            инструкции
       }
         */

          /*
        if (boolean выражение1) {
            инструкции
       } else if (boolean выражение 2) {
            инструкции
       } else if (boolean выражение 3) {
            инструкции
       } else {
            инструкции
       }
         */

        int state = 1;
        if (state == 0) {
            System.out.println("Закрытие приложения");
        }else if (state==1){
            System.out.println("Открытие приложения");
        }else {
            System.out.println("Ошибка статуса");
        }

        int month =5;
        if (month==12||month==1||month==2){
            System.out.println("Зима");
        }else if (month==3||month==4||month==5){
            System.out.println("Весна");
        }else if (month==6||month==7||month==8){
            System.out.println("Лето");
        }else if (month==9||month==10||month==11){
            System.out.println("Осень");
        }else {
            System.out.println("Ошибка");
        }

         switch (month){
             case 1:
             case 2:
             case 12:
                 System.out.println("Зима");
             case 3:
             case 4:
             case 5:
                 System.out.println("Весна");
         }

        int sum =1000, saleCode =7647;
        switch (saleCode){
            case 4525:
                System.out.println(sum*0.7);
                break;
            case 6424:
            case 7012:
                System.out.println(sum*0.8);
                break;
            case 7647:
            case 9011:
            case 6612:
                System.out.println(sum*0.9);
                break;
            default:
                System.out.println(sum);
        }



    }
}
