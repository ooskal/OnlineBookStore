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
}
