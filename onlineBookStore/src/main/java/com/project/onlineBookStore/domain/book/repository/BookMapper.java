package com.project.onlineBookStore.domain.book.repository;

import com.project.onlineBookStore.domain.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    public List<Book> findById();
    public void insertBook(Book book);
    public void deleteBook(Book book);



}