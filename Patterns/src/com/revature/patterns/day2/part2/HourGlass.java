package com.revature.patterns.day2.part2;

public class HourGlass {
    public static void main(String[] args) {
        int size = 5;

        // Upper part of the hourglass
        for (int i = size; i >= 1; i--) {
            for (int j = size; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = 2; i <= size; i++) {
            for (int j = size; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
