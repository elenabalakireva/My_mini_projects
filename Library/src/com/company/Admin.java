package com.company;

public class Admin extends Staff implements AdminImpl {
    public String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void order(Supplier supplier) {
        System.out.format("Администратор %s заказал у поставщика %s книги жанра %s.", this.name, supplier.getName(), supplier.genre);
        System.out.println();
    }

}
