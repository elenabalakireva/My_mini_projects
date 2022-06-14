package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Молоко", "Кефир", "Сметана", "Чай"};
        int[] prices = {50, 55, 60, 40};
        int[] quantityOfProducts = new int[4];
        int sum = 0;
        System.out.println("Список возможных продуктов: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб.");
        }

        while (true) {
            System.out.println("Напишите товар и количество или end");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                String[] parts = input.split(" ");
                int product = Integer.parseInt(parts[0]);
                int quantity = Integer.parseInt(parts[1]);
                quantityOfProducts[product - 1] += quantity;

            }

        }
        System.out.println("Наименование товара  Количество  Цена  Общая стоимость");

        for (int i = 0; i < products.length; i++) {
            if (quantityOfProducts[i] > 0) {
                System.out.println(products[i] + "   " + quantityOfProducts[i] + "   " + prices[i] + "   " + (prices[i] * quantityOfProducts[i]));
            }
            sum = sum + prices[i] * quantityOfProducts[i];
        }
        System.out.println("Итого:   " + sum + " рублей.");

    }
}
