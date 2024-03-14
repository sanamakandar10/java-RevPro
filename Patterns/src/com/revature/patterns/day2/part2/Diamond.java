package com.revature.patterns.day2.part2;

public class Diamond {
    public static void main(String[] args) {
        int size = 5;

        // Upper part of the diamond
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= size - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
