package com.project.onlineBookStore.domain.book.service;

import com.project.onlineBookStore.domain.book.dto.BookDto;
import com.project.onlineBookStore.domain.book.entity.Book;
import com.project.onlineBookStore.domain.book.repository.BookMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService  {
    private BookMapper bookMapper;

    public void addBook(BookDto bookDto) {
//        bookMapper.insertBook(req.getTitle(), req.getPrice());
        bookMapper.insertBook(new Book(bookDto.getTitle(), bookDto.getPrice()));
    }
}
