package com.company;

public class Reader extends LibraryEnvironment implements ReaderImpl {
    private String name;
    private int id;
    private String favoriteBook;
    private int daysRead;

    public Reader(String name, int id, String favoriteBook, int daysRead) {
        this.name = name;
        this.id = id;
        this.favoriteBook = favoriteBook;
        this.daysRead = daysRead;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public int getDaysRead() {
        return daysRead;
    }
}
