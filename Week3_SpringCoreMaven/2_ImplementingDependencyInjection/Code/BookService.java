package com.pringcoreandmaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pringcoreandmaven.repository.BookRepository;

@Service  // Marks it as a Spring bean
public class BookService {

    private BookRepository bookRepository;

    // Setter injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Books: " + bookRepository.getAllBooks());
    }
}
