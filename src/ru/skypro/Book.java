package ru.skypro;

public class Book{
    Author author;
//    private Object Author;
    private String bookName;
    private int releaseOfYear;


    public Book(String bookName, Author author,int releaseOfYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseOfYear = releaseOfYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.getAuthor();
    }

    public int getReleaseOfYear() {
        return this.releaseOfYear;
    }

    public void setReleaseOfYear(int releaseOfYear) {
        this.releaseOfYear = releaseOfYear;
    }
}
