package com.revature.patterns.day2.part1;

public class TripleHollowSquare {
    public static void main(String[] args) {
        int size = 5;
        int numberOfSquares=3;

        for (int i = 1; i <= size; i++) {

            for(int t=1;t<=numberOfSquares;t++) {
                for (int j = 1; j <= size; j++)
                    System.out.print((i == 1 || i == size || j == 1 || j == size) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
