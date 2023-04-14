package com.project.onlineBookStore.domain.book.dto;

import lombok.*;

@Data
@NoArgsConstructor
public class BookDto {
    private int bookId;
    private String title;
    private int price;
}
