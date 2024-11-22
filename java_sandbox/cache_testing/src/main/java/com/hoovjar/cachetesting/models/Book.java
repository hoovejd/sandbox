package com.hoovjar.cachetesting.models;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book {

    @NonNull
    private String isbn;
    @NonNull
    private String title;
}
