package com.revature.patterns;

public class Square {
    public static void main(String[] args) {
        int side = 5;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

