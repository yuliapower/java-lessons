package ru.itmo.lessons.lesson6.books;

import java.util.Objects;

//ru.itmo.lessons.lesson6.books.Book
public class Book {
    //свойства:
    private String title;   // название
    private int pageCount;  // количество страниц
    public Author author;  // автор

    public Book(){}   //1 тип конструктора

    public Book(Author author) {
        this.author=  Objects.requireNonNull(author, "author не может мб null");
                       //2 тип конструктора
    }

    public Book(String title, Author author){          //3 тип конструктора
       //вызвать другой конструктор
        this(author);  //дублирование строчки   this.author=  Objects.requireNonNull(author, "author не может мб null");
         setTitle(title);
    }

    //privite - к свойству и методу можно обратится только из ткущего класса
//методы позволяющие установить значение свойств
// со всеми необходимыми проверками = сеттеры
public void setTitle(String titleValue){
    if (titleValue == null || titleValue.length()<3){
        throw new IllegalArgumentException("Значение title от 3 символов");

    }
    title = titleValue;

}
public String getTitle() {return title;}

    public void setPageCount(int pageCount){
    if (pageCount<10){
        throw new IllegalArgumentException("Значение pageCount дб больше 10");
    }
    //this - ссылка на текущий объект
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}
