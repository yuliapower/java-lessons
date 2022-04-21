package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class StringLesson {
    public static void main(String[] args) {
//        String s = "Hello";
//        String s2 = "Hello";
//        String a = "Hello";
//        String b = "HellO";
//        System.out.println(b);
//        String b1 = b.toLowerCase();
//        System.out.println(b1);
//        //String - immutable
//        //Область памяти где хранятся строки - String pool
//        String s1 = new String("Hello");
//        System.out.println(s.equals(s1)); //сравнивается лексикографически
//        System.out.println(s == s1);//сравниваются ссылки

       // Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        if (input.isEmpty()){ // проверка для пользователя на пустое значение
//            System.out.println("Cannot empty");
//        }
//        System.out.println(input.length());//
//
//        System.out.println(input.charAt(5)); // вывести символ под индексом
//         String result = input.concat("ghhjhj") + "hfkvf";
//        System.out.println(result);

//        int[] arr = {1,2,3,9,9,10};
//        int[] arr1 = {1,2,3,9,9,9,10};
//
//
//        System.out.println(Arrays.compare(arr,arr1));
//
//
//        int[] newArr = Arrays.copyOf(arr,2);
//        int[] newArr1 = Arrays.copyOfRange(arr,0,1);
//        System.out.println(Arrays.toString(newArr));
//        System.out.println(Arrays.toString(newArr1));
//
//
//        System.out.println(Arrays.mismatch(arr,arr1));

//char (примитивный тип данных) 16 битный символ Unicode
        //от 0 до 65536 / '\u0000' до '\uffff'
        char char1 = 'J'; //один символ в одинарных кавычках
        char char2 = 74; //номер символа из таблицы unicode
        char char3 = '\u0044'; //16тиричное значение escape
        System.out.print(char1); //J
        System.out.print(char2); //J
        System.out.print(char3); //D
        System.out.println("\nСтроки"); //перенос \n

//Строка - упорядоченная последовательность символов
        // Строка - ссылочный тип, экземпляр класса String
        // 1. строки задаются в двойных кавычках
        // 2. new String - если невозможно использовать двойные кавычки
        // Строки неизменны, можно лишь создать новую строку на основе существующей
        //
        System.out.println("Строковый литерал".length());

char[] chars = {'\u004A', '\u004A', '\u0044'};
String jjdString = new String(chars);
        System.out.println(jjdString); //JJD
        System.out.println(jjdString.length()); //вернет длину строки (3)

        char[] chars1 = {'\uD83D','\uDC38'}; //суррогатная пара чаров
        String frogString = new String(chars1);
        System.out.println(frogString); //🐸
        System.out.println(frogString.length()); //2
        System.out.println(frogString.codePoints().count()); //1 количество реальных символов

// Хранение строк до JAVA 9: массив char[] в кодировке UTF-16
        //каждый чар был представлен двумя байтами

        // начиная с 9 версии строки хранятся как массив (компактные строки)
        // byte[] + кодировка LATIN1 или UTF16

        // Пул строк - набор уникальных строк. Хранит только одну копию строкового литерала
        // Пул строк: "Строка"

        String string1 = "Строка"; //в памяти один объект а стринг1 и стринг2 ссылаются на один и тот же объект
        String string2 = "Строка";
        String string3 = new String("Строка"); //создается объект.не хранится в пуле/heap память - куча
        System.out.println(string1==string2); //true
        System.out.println(string1==string3); //false

        String internString = string3.intern();  //интернирование в пуле смотрит есть такая строка или нет возвращает из пула
        System.out.println(internString); //ответ - строка

        // == сравниваются ссылки а не объекты
        System.out.println(string1.equals(string2)); //true равны
        System.out.println("Строка".equals(string2)); //true
        System.out.println("cтрока".equalsIgnoreCase(string2)); //true

        //string2 = null;
        System.out.println("строка".equals(string2)); //false . при нале не будет ошибки
        System.out.println(string2.equals("строка")); //false. при null будет ошибка

        //System.out.println(string2 == null); //true при сравнении с нуль можно использовать обычное равно
        //System.out.println(string2!=null); //false

        string1 = "Java";
        string2 = "Python";

        //конкатенация строк
        String concatString = string1 + " :: " + string2;
        System.out.println(concatString);

        concatString = string1.concat(" :: ").concat(string2); //Java :: Python

        concatString = String.join(" :: ", string1,string2); //Java :: Python
        concatString = String.join(" :: ", string1,string2, string3); //Java :: Python :: Строка
        System.out.println(concatString);
        concatString = "";
        for (int i = 0; i < 10; i++) {
            concatString+=i+ " "; //0 1 2 3 4 5 6 7 8 9

        }
        System.out.println(concatString);
        // StringBuilder - работает быстрее, чем бафер
       // StringBuffer - потокобезопасный - для многопоточных приложениях

        concatString = "Начало строки";
        StringBuilder sb = new StringBuilder(concatString);
        sb.append(string1).append(" :: ").append(string2); //Начало строкиJava :: Python
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10; i+=1) {
            sb2.append(i).append(" ");
        }
        System.out.println(sb2);
        String sbString = sb2.toString(); //возвращает строчку которую накопил билдер
        System.out.println(sbString);

        //метод split()
        String langs = "Java, Python, JavaScript";
        String[] langArr = langs.split(", ");
        System.out.println(Arrays.toString(langArr)); //[Java, Python, JavaScript]
        // методы замены
        String newString = langs.replaceAll(", ", " - "); //поддерживает регулярное выражение
        System.out.println(newString); //Java - Python - JavaScript

        newString = langs.replaceFirst(", ", " - "); //только первую последовательность заменяет
        System.out.println(newString); //Java - Python, JavaScript

        newString = langs.replace(", ", " - "); //поддерживает только последовательность
        System.out.println(newString);

        System.out.println(langs.contains("th")); // true
        System.out.println(langs.startsWith("j")); //false начинается ли строка с этого
        System.out.println(langs.endsWith("Script")); //true заканчивается ли строка этим
        System.out.println(langs.startsWith("a", 1)); //true
    }

}
