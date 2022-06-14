package com.company;

public class Supplier extends Staff implements ReaderImpl, SupplierImpl {
    public String name;
    public String genre;
    public int id;
    public String favoriteBook;
    public int daysRead;
    public String car;

    public Supplier(String name, String genre, int id, String favoriteBook, int daysRead, String car) {
        this.name = name;
        this.genre = genre;
        this.id = id;
        this.favoriteBook = favoriteBook;
        this.daysRead = daysRead;
        this.car = car;
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

    public int getDaysRead() {
        return daysRead;
    }

    public void likeRead() {
        System.out.format("Наш поставщик %s тоже любит читать книги. Его номер в библиотеке %s, любимая книга %s.", this.name, this.id, this.favoriteBook);
        System.out.println();
    }

    public void supplierCar() {
        System.out.format("Поставщик %s осуществляет доставку на машине %s.", this.name, this.car);
        System.out.println();
    }
}
