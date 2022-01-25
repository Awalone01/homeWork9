package ru.skypro.homeWork9;

import ru.skypro.Author;
import ru.skypro.Book;

public class Main {

    public static void main(String[] args) {
        Author dumas = new Author("Александр", "Дюма");
        Author govanioli = new Author("Рафаэлло", "Джованьоли");

        Book threeMusketeers = new Book("Три мушкетёра", dumas,  1844);
        Book spartacus = new Book("Спартак", govanioli, 1874);
        System.out.println(threeMusketeers.getBookFullInfo());
        System.out.println(spartacus.getBookFullInfo());
        threeMusketeers.setReleaseOfYear(1850);
        System.out.println("Меняем год публикации");
        System.out.println(threeMusketeers.getBookFullInfo());


    }
}

