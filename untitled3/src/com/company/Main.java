package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        validateUser(getUserByLoginAndPassword(login, password));

        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user1 = new User("john", "pass", "jhon@gmail.com", 4);
        User user2 = new User("Nike", "123456", "123@mail.ru", 3);
        User user3 = new User("Anna", "qwerty", "anna@yandex.ru", 35);
        User user4 = new User("Kris", "951753", "kris@mail.ru", 42);
        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {

        User[] users = getUsers();
        User x = null;
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                x = user;
            }
        }
        if (x == null) {
            throw new UserNotFoundException("User not found");

        }
        return x;
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("You are under 18 years old");
        }
    }
}
