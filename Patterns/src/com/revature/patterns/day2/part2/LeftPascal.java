package com.revature.patterns.day2.part2;

public class LeftPascal {
    public static void main(String[] args) {
        int size = 5; // Change this value to adjust the size of the pattern

        // Upper part of the pattern
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
