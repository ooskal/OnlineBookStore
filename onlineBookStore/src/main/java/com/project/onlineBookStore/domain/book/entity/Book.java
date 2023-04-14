package com.project.onlineBookStore.domain.book.entity;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@Getter
@Setter

public class Book {
    public Book() {}

    public Book(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    private int bookId; // 식별번호
    private String title; // 책 제목
    private int price;  // 책 가격

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
