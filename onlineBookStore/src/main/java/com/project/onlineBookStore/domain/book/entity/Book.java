package com.project.onlineBookStore.domain.book.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    private String title; // 책 제목
    private int price;  // 책 가격

}
