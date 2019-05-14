package com.example.test.controller;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
