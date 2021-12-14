package ru.skypro;

public class Book {
    private String bookName;
    private String author;
    private int releaseOfYear;

    public Book(String bookName, String author, int releaseOfYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseOfYear = releaseOfYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getReleaseOfYear() {
        return this.releaseOfYear;
    }

    public void setReleaseOfYear(int releaseOfYear) {
        this.releaseOfYear = releaseOfYear;
    }
}
