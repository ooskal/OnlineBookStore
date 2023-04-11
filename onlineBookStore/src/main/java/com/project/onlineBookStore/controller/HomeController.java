package com.project.onlineBookStore.controller;

import com.project.onlineBookStore.domain.book.dto.BookDto;
import com.project.onlineBookStore.domain.book.entity.Book;
import com.project.onlineBookStore.domain.book.service.BookService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
@AllArgsConstructor
public class HomeController {
    BookService bookService;



    @GetMapping("/index")
    public String getSelectBook(Model model) {

        return "index";
    }




}
