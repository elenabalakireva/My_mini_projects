package com.company;

public class Main {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Федор", 11525, "Преступление и наказание", 20);
        Librarian librarian1 = new Librarian("Инокентий", 2, "Преступление и наказание");
        Supplier supplier1 = new Supplier("Петя", "романы", 13659, "Идиот", 5, "BMW");
        Admin admin1 = new Admin("Дмитрий");

        admin1.order(supplier1);
        librarian1.likeBook(reader1);
        librarian1.data(reader1);
        supplier1.supplierCar();
        supplier1.likeRead();
    }
}
