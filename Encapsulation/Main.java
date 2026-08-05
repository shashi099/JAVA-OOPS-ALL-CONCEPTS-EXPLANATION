package Encapsulation;

// Project of Library Managemant
// 1. Library Management System

// Concepts: Classes, Objects, Encapsulation

// Create classes: Book, Member, Library
// Features:
// Add/remove books
// Issue/return books
// Practice:
// Private variables + getters/setters
// Object interaction


import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create Library
        Library library = new Library();

        // Create Books
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("OOP Concepts", "Bjarne Stroustrup");

        // Add Books to Library
        library.addBook(b1);
        library.addBook(b2);

        // Show all books
        library.showBooks();

        // Create Member
        Member m1 = new Member("Rahul", 101);

        // Issue a book
        m1.issueBook(b1);

        // Show books after issuing
        library.showBooks();

        // Return the book
        m1.returnBook(b1);

        // Final state
        library.showBooks();
    }
}


class Library {
    // private book lists
    private ArrayList<Book> books;
    
    //constructors
    public Library(){
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to library.");
    }

    // Remove a book
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book.getTitle() + " removed from library.");
    }

    // Show all books
    public void showBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() +
                    (book.isIssued() ? " [Issued]" : " [Available]"));
        }
    }


}

class Book{
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
        this.isIssued = false;  // default
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isIssued(){
        return isIssued;
    }

    // setter
    public void isIssued(boolean issued){
        isIssued = issued;
    }

}

class Member{
    private String name;
    private int memberId;

    // Constructor
    public Member(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
    }

    public String getName(){
        return name;
    }
    public int getMemberId(){
        return memberId;
    }

    //Method to issue a book
    public void issueBook(Book book){
        if(!book.isIssued()){
            book.isIssued(true);
            System.out.println(name + " issuued the book: " + book.getTitle());
        }else{
            System.out.println("Book is already issued!");
        }
    }

    // method to return the book
    public void returnBook(Book book){
        if(book.isIssued()){
            book.isIssued(false);
            System.out.println(name + " return the book: "+ book.getTitle());
        }else{
            System.out.println("Book was not issued!");
        }
    }

}
