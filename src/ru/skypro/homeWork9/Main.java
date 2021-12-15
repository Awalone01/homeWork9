package ru.skypro.homeWork9;

import ru.skypro.Author;
import ru.skypro.Book;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Дюма");
        System.out.println("Имя автора - " + author1.getFirstName());
        System.out.println("Фамилия автора - " + author1.getSecondName());

        Author author2 = new Author("Рафаэлло", "Джованьоли");
        System.out.println("Имя автора - " + author2.getFirstName());
        System.out.println("Фамилия автора - " + author2.getSecondName());

        Book threeMusketeers = new Book("Три мушкетёра", author1,  1844);
        System.out.println("Название книги - " + threeMusketeers.getBookName());
        System.out.println("Автор - " + threeMusketeers.getAuthor());
        System.out.println("Год публикации - " + threeMusketeers.getReleaseOfYear());
        threeMusketeers.setReleaseOfYear(1850);
        System.out.println("Год публикации - " + threeMusketeers.getReleaseOfYear());

        Book spartacus = new Book("Спартак", author2, 1874);
        System.out.println("Название книги - " + spartacus.getBookName());
        System.out.println("Автор - " + spartacus.getAuthor());
        System.out.println("Год публикации - " + spartacus.getReleaseOfYear());


    }
}

