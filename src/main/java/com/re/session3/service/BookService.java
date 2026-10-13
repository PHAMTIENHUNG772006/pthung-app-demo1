package com.re.session3.service;

import com.re.session3.model.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book saveBook(Book book);
    Book updateBook(Book book);
    Boolean deleteBook(Long id);
    Book getBookByAuthor(String author);
}
