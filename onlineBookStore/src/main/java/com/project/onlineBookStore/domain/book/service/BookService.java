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
        bookMapper.insertBook(new Book(bookDto.getBookId(),bookDto.getTitle(), bookDto.getPrice()));
    }

    public void deleteBook(BookDto bookDto) {
        bookMapper.deleteBook(new Book(bookDto.getBookId(), bookDto.getTitle(), bookDto.getPrice()));
    }

    public void updateBook(BookDto bookDto) {
        Book book = new Book(bookDto.getBookId(),bookDto.getTitle(),bookDto.getPrice());
        bookMapper.updateBook(book);
    }

    public List<Book> findBooks() {
        return bookMapper.findByTitle();
    }




}
