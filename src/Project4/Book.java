package src.Project4;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Геттеры и сеттеры для свойств книги

    public void displayInfo() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }
}

