package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = 8;
        int[][] colors = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                colors[i][j] = random.nextInt(256);
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        while (true) {
            System.out.println("Как повернуть матрицу? (выберите желаемый вариант)");
            System.out.println("1. На 90°");
            System.out.println("2. На 180°");
            System.out.println("3. На 270°");
            String input = scanner.nextLine();
            int degree = Integer.parseInt(input);
            if (degree == 3) {
                for (int i = size - 1; i >= 0; i = i - 1) {
                    for (int j = 0; j < size; j++) {
                        System.out.format("%4d", colors[j][i]);
                    }
                    System.out.println();
                }
            }
            if (degree == 2) {
                for (int i = size - 1; i >= 0; i = i - 1) {
                    for (int j = size - 1; j >= 0; j = j - 1) {
                        System.out.format("%4d", colors[i][j]);
                    }
                    System.out.println();
                }
            }
            if (degree == 1) {
                for (int i = 0; i < size; i++) {
                    for (int j = size - 1; j >= 0; j = j - 1) {
                        System.out.format("%4d", colors[j][i]);
                    }
                    System.out.println();
                }
            }
        }
    }
}



