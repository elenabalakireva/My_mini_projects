package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int previousFloor = -1;
        int floor;
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String input = scanner.nextLine();
            floor = Integer.parseInt(input);

            if (floor == 0) {
                break;
            }
            if ((floor > 0) && (floor < 26)) {
                queue.add(floor);
            } else {
                System.out.println("Такого этажа в доме нет.");
                continue;
            }
            if (previousFloor != -1) {
                total += calculatTime(floor, previousFloor);
            }
            previousFloor = floor;
        }

        if (total != 0) {
            total += calculatTime(floor, previousFloor);
        }

        while (!queue.isEmpty()) {
            System.out.print("этаж " + queue.poll() + " -> ");
        }
        System.out.println("этаж 0");
        System.out.println("Время затраченное лифтом на маршрут: " + total + "с.");
    }

    static int calculatTime(int floor, int previousFloor) {
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        totalSeconds += Math.abs(floor - previousFloor) * waitMoveInSeconds;
        totalSeconds += waitDoorsInSeconds;
        return totalSeconds;
    }
}

