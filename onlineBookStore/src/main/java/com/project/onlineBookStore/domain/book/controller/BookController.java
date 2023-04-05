package com.project.onlineBookStore.domain.book.controller;

import com.project.onlineBookStore.domain.book.dto.BookDto;
import com.project.onlineBookStore.domain.book.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
@Slf4j
public class BookController {

    private final BookService bookService;

    @GetMapping("/insertBook")
    public String GetInsertBook(Model model) {
        model.addAttribute("book", new BookDto());
        return "insertBook";
    }

    @PostMapping("/insertBook")
    public String postInsertBook(BookDto bookDto) {
        log.info("BookDTO : " + bookDto.toString());
        bookService.addBook(bookDto);
        return "insertBook";
    }

}
