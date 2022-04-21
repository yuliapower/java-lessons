package ru.itmo.lessons.lesson6.books;

import ru.itmo.lessons.lesson6.books.Author;
import ru.itmo.lessons.lesson6.books.Shell;
import ru.itmo.lessons.lesson6.books.Book;

//ru.itmo.lessons.lesson6.Application
// - полное имя класса: имя класа плюс имя пакета
public class Application {
    public static void main(String[] args) {
        // класс -способ описания сущности,
        // определяющий ее состояние и поведение
        // класс- набор свойств и методов будущих объектов
        // На основе класса создаются объекты (экземпляры данного класса)
        // представители данного класса, имеющие конкретное состояние и поведение,
        // определенное в классе
        // у каждлого класса строго своя зона ответсвенности
        // books -> Author

        //объект, экземпляр класса Author
        //если классы находятся в разных пакетах - класс надо импортировать import ru.itmo.lessons.lesson6.books.Author;

        Author author1 = new Author();
        //обращение к свойствам осуществляется через .
        author1.name = "Tom";
        author1.surname = "Crowed";

        Author author2 = new Author();
        author2.name = "Mike";
        author2.surname = "Thompson";

        //вызов методов
        author1.printFullName();
        author2.printFullName();

        String fullName = author1.getFullName();
        System.out.println(fullName);
        author2.getFullName();

        Book book1 = new Book(); //вызов конструктора
book1.setTitle("Книга");
        System.out.println(book1.getTitle());
        book1.setPageCount(22);

        Shell shell = new Shell();
        shell.addBook(book1);
        shell.addBook(book1,book1,book1);
        // вывод имени автора первой книги на полке
        System.out.println(shell.books[0].author.name);
    }
}
