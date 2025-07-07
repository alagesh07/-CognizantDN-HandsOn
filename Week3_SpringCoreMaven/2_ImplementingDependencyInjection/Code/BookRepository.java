package com.pringcoreandmaven.repository;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository  
public class BookRepository {

    public List<String> getAllBooks() {
        return Arrays.asList("Harry Potter", "Lord of the Rings", "Java Basics");
    }
}
