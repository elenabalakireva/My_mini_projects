package com.company;

public class Librarian extends Staff implements LibrarianImpl, ReaderImpl {
    public String name;
    public int id;
    public String favoriteBook;

    public Librarian(String name, int id, String favoriteBook) {
        this.name = name;
        this.id = id;
        this.favoriteBook = favoriteBook;
    }

    public void showName() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void showId() {
        System.out.println(this.id);
    }

    public String getFavoriteBook() {
        return favoriteBook;
    }

    public void likeBook(Reader reader) {
        if (this.favoriteBook.equals(reader.getFavoriteBook())) {
            System.out.println("Библиотекарь " + this.name + " одобряет выбор читателя " + reader.getName());

        } else {
            System.out.println("Библиотекарь " + this.name + "злится.");

        }
    }

    public void data(Reader reader) {
        if (reader.getDaysRead() > 10) {
            System.out.format("Библиотекарь %s должен оповестить %s о том, что книгу пора возвращать.", this.name, reader.getName());
            System.out.println();
        }

    }

}

