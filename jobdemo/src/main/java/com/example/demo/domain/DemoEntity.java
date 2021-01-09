package com.example.demo.domain;

import javax.persistence.*;


@Entity

public class DemoEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String author ;

    private String book ;

    private String publishing ;

    public DemoEntity() {
    }

    public DemoEntity(int id, String author, String book, String publishing) {
        this.id = id;
        this.author = author;
        this.book = book;
        this.publishing = publishing;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }


    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", book='" + book + '\'' +
                ", publishing='" + publishing +
                '}';
    }
}
