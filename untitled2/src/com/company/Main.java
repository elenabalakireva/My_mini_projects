package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        while (true) {
            System.out.format("У игрока %d слота с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n", 4);
            int numberOfSlot = scanner.nextInt();
            if (numberOfSlot == -1) {
                System.out.println("Game over!");
                break;
            } else {
                player.weaponSay(numberOfSlot);
            }
        }

    }
}
