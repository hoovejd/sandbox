package com.hoovjar.cachetesting.repositories;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.hoovjar.cachetesting.models.Book;

@Component
public class SimpleBookRepository implements BookRepository {

    @Override
    @Cacheable(cacheNames = "books", key = "#isbn")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some book");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}