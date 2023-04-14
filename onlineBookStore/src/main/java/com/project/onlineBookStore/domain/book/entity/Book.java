package com.project.onlineBookStore.domain.book.entity;


import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Book {
    private int bookId; // 식별번호

    private String title; // 책 제목
    private int price;  // 책 가격


}
