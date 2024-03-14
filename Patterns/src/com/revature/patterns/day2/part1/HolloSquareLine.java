package com.revature.patterns.day2.part1;

public class HolloSquareLine {
    public static void main(String[] args) {
        int size = 5;

        // First Square
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++)
                System.out.print((i == 1 || i == size || j == 1 || j == size) ? "*" : " ");
            System.out.println();
        }

        // Second Square
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++)
                System.out.print(( i == size || j == 1 || j == size) ? "*" : " ");
            System.out.println();
        }

        //Second Square
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++)
                System.out.print(( i == size || j == 1 || j == size) ? "*" : " ");
            System.out.println();
        }
    }
}
