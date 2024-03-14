package com.revature.patterns.day2.part1;

public class TripleHollowSquare2 {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            // First Square
            for (int j = 1; j <= size; j++)
                System.out.print((i == 1 || i == size || j == 1 || j == size) ? "*" : " ");

            //Second Square
            for (int j = 1; j <= size; j++)
                System.out.print((i == 1 || i == size || j == size) ? "*" : " ");

            //Third Square
            for (int j = 1; j <= size; j++)
                System.out.print((i == 1 || i == size || j == size) ? "*" : " ");

            System.out.println();
        }
    }
}
