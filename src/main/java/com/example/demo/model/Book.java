package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Internal DB primary key

    private String bookId;    // Custom book ID, like ISBN or unique code
    private String title;
    private String author;
    private Double price;
    private boolean available;

    @ManyToOne
    @JsonBackReference
    private Publisher publisher;

    public Book() {}

    public Book(String bookId, String title, String author, Double price, boolean available, Publisher publisher) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
        this.publisher = publisher;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public Publisher getPublisher() { return publisher; }
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }
}
