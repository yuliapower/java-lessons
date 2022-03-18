package lesson1;

public class FirstLesson {
    /*
    многострочный комм
     */

    /**
     * документирование кода
     **/
    public static void main(String[] args) {
        System.out.println("Информация для вывода в консоль");
        int size;
        size=56;
        int count=71899;
        int length=122, width = 500;
        count=8000_000; //для удобства чтения больших чисел
        long veryBig = 67_000_000_000L;
        System.out.println(count);
        double price = 56.7;
        float temp = -78.3F;
        count=8700;
        price=count; //автоматическое приведение типов
        System.out.println(price);
        byte small = (byte) count;
        System.out.println(small);
byte x=6,y=12;
byte z=(byte) (x+y);
int num =10;
num +=10; //num=num+10;
num -=10; //num = num-10;
num *=10; //num = num*10;
num /=10; //num=num/10;
num %=10; //num = num % 10;


        System.out.println(y>x);
        System.out.println(40<=40);

        //тернарный оператор
        int start =3, end =5000;
        int res = start > end ? end -start:0;
        System.out.println(res);

        //оператор + - складывает и возвращает


    }
}
