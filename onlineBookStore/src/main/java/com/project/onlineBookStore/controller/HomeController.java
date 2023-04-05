package com.project.onlineBookStore.controller;

import com.project.onlineBookStore.domain.book.entity.Book;
import com.project.onlineBookStore.domain.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private BookService bookService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    } // 메인페이지 호출 컨트롤러


}
