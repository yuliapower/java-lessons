package ru.itmo.lessons.lesson6.books;

public class Shell {
    private String color = "белый"; //цвет полки   не можем измениьь цвет.если только напишем сеттер
   public Book[] books = new Book[10]; //книги

    public void addBook(Book book){  //позволяют добавить книгу на полку
        for (int i = 0; i < books.length; i++) {     //[null, null, null...]
            if (books[i]==null) {
                books[i]=book;
                return;  //не брейк потому что надо закнчить весь метод
            }

        }
        System.out.println("Нет места");
    }

    // метод добавления нескольких книг на полку
    public void addBook(Book... books){

    }
}
