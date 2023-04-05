package com.project.onlineBookStore.domain.book.repository;

import com.project.onlineBookStore.domain.book.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    List<Book> selectAll();
    void insertBook(Book book);

}