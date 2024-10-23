package com.example.demo;

public class App {

    public int addition(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.addition(2, 3));
    }
}