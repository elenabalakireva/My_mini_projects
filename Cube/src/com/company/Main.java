package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int SIZE = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[][] colors = new int[SIZE][SIZE];

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                colors[i][j] = random.nextInt(256);

            }

        }
        print(colors);


        while (true) {
            System.out.println("Как повернуть матрицу? (выберите желаемый вариант)");
            System.out.println("1. На 90°");
            System.out.println("2. На 180°");
            System.out.println("3. На 270°");
            String input = scanner.nextLine();
            print(rotate(colors, input));

        }
    }

    public static int[][] rotate(int[][] colors, String input) {
        int[][] rotated = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (input.equals("3")) {
                    rotated[SIZE - j - 1][i] = colors[i][j];
                } else if (input.equals("2")) {
                    rotated[SIZE - i - 1][SIZE - j - 1] = colors[i][j];
                } else if (input.equals("1")) {
                    rotated[j][SIZE - i - 1] = colors[i][j];
                }
            }
        }

        return rotated;

    }

    public static void print(int[][] colors) {

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}






