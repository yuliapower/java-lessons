package ru.itmo.lessons.lesson6.books;

//ru.itmo.lessons.lesson6.books.Author
//свойства, характеристики, поля, атрибуты
public class Author {
    public String name; //null
    public String surname; //public можно обращаться из любого класса
    //методы
    //какие-то инструкции типо принтлн, невозвращающие никакого результата то эт войд

    //объявление методов
    public  void printFullName() {
        //return в void только для прерывания работы метода 'return;'
        System.out.println(name+ " " + surname);
    }

    public String getFullName(){
        return name + " " + surname;
        //return возвращает результат работы метода
        //прерывает работу метода,
        // инструкции после return не будут выполнятся
        //return в void только для прерывания работы метода
    }
}
