package com.revature.patterns.day2.part1;

public class HollowSquareMatrix {
    public static void main(String[] args) {
        int size=5;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <size ; j++) {

                    for (int k = 0; k < 3; k++) {
                        if (j == 0 || j == size - 1 || k == 0 || k == 2) {
                            for (int l = 0; l < size; l++) {
                                System.out.print("* ");
                            }
                        } else {
                            for (int l = 0; l < size; l++) {
                                if (l == 0 || l == size - 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }

                        System.out.print("  ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
    }
