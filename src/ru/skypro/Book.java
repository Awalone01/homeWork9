package ru.skypro;

public class Book{
    private final Author author;
    private final String bookName;
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
        return this.author;
    }

    public int getReleaseOfYear() {
        return this.releaseOfYear;
    }

    public void setReleaseOfYear(int releaseOfYear) {
        this.releaseOfYear = releaseOfYear;
    }

    public String getBookFullInfo() {
        return this.bookName + " " + author.getAuthorFullName() + " " + this.releaseOfYear;
    }
}