package com.company;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y; работать не будет, т.к. происходит деление на 0
    // Предлагаю в случае, если у=0, выводить на экран "0"
    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<Boolean> printlnB = System.out::println;
}
