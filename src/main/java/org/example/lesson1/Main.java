package org.example.lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new User("Test", 1, 2));
        System.out.println(new Test().getHello());
        for (String arg : args) {
            System.out.println("arg: " + arg);
        }
    }
}