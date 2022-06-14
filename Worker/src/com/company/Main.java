package com.company;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener1 = System.out::println;
        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}
