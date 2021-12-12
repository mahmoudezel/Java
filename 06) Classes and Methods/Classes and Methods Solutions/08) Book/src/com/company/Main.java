package com.company;

class Book {
    private String name;
    private final String ISBN;
    private String author;
    private String publisher;

    Book(String name, String ISBN, String author, String publisher) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return "Name : " + name + "\n" + "ISBN : " + ISBN + "\n" + "Author : " + author + "\n" + "Publisher : " + publisher + "\n";
    }
}

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java: An Introduction to Problem Solving and Programming",
                "0134462033", "Walter Savitch", "Pearson");
        System.out.print(book.getBookInfo());
    }
}