package com.hoovjar.cachetesting.repositories;

import com.hoovjar.cachetesting.models.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
