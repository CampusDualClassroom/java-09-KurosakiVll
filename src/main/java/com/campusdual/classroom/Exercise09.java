package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(15);
    }

    public static void doWhileLoop(int num) {
        int i = 0;

        do {
            System.out.println("Entra con valor: " + i + ", sale con valor: " + (i + 1));
            i++;
        } while (i < num);
    }
}