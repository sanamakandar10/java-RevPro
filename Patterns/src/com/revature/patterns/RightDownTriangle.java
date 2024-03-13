package com.revature.patterns;

public class RightDownTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
