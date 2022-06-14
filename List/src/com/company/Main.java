package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(5);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");
            String input = scanner.nextLine();
            try {
                if (input.equals("0")) {
                    break;
                }
                int x = Integer.parseInt(input);
                switch (x) {
                    case (1):
                        System.out.println("Введите задачу");
                        list.add(scanner.nextLine());
                        break;
                    case (2):
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                        break;
                    case (3): {
                        System.out.println("Введите номер задачи");
                        String number = scanner.nextLine();
                        int index = Integer.parseInt(number);
                        list.remove(index - 1);
                    }
                    break;
                    case (0):
                        break;
                    default:
                        System.out.println("Не корректный номер");
                }
            } catch (RuntimeException err) {
                System.out.println("Ввод должен содержать только цифры от 0 до 3");
            }
        }

    }
}
