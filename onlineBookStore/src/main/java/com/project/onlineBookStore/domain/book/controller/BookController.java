package com.project.onlineBookStore.domain.book.controller;

import com.project.onlineBookStore.domain.book.dto.BookDto;
import com.project.onlineBookStore.domain.book.entity.Book;
import com.project.onlineBookStore.domain.book.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("books")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;


    @GetMapping("addBook")
    public String getInsertBook(Model model) {
        model.addAttribute("book", new BookDto());
        return "admin/addBook";
    }

    @PostMapping("addtBook")
    public String postInsertBook(BookDto bookDto) {
        log.info("BookDTO : " + bookDto.toString()); // 책 추가
        bookService.addBook(bookDto);
        return "admin/addBook";
    }

    @GetMapping("deleteBook")
    public String getDeleteBook(Model model) {
        model.addAttribute("book", new BookDto());
        return "admin/addBook";
    }

    @PostMapping("deleteBook")
    public String postDeleteBook(BookDto bookDto) {
        log.info("BookDTO : " + bookDto.toString()); // 책 삭제
        bookService.deleteBook(bookDto);;
        return "admin/addBook";
    }

    @GetMapping("updateBook")
    public String getUpdateBook(Model model,BookDto bookDto) {
        model.addAttribute("book", bookDto);
        return "admin/addBook";
    }

    @PostMapping("updateBook")
    public String postUpdateBook(BookDto bookDto) {
        log.info("BookDTO : " + bookDto.toString()); // 책 수정
        bookService.updateBook(bookDto);;
        return "admin/addBook";
    }

    @GetMapping("/selectAllBook")
    public String list(Model model) {
        List<Book> books = bookService.findBooks();

        model.addAttribute("books", books);
        log.info("Book: " + books.toString());

        return "selectAllBook";
    }



}
