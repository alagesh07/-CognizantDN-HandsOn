package com.pringcoreandmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pringcoreandmaven.service.BookService;

@SpringBootApplication
public class LibraryManagementAppApplication implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementAppApplication.class, args);
    }

    @Override
    public void run(String... args) {
        bookService.displayBooks();
    }
}
