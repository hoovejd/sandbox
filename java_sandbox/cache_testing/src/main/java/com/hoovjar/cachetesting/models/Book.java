package com.hoovjar.cachetesting.models;

import java.io.Serializable;

import lombok.Data;
import lombok.NonNull;

@Data
public class Book implements Serializable {

    @NonNull
    private String isbn;
    @NonNull
    private String title;
}
