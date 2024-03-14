package com.revature.patterns.day2.part1;

public class HollowSquareMatrix {
    public static void main(String[] args) {
        int size = 5;
        int rows = 3;
        int cols = 3;
        int r=1;
        for (int j = 0; j < size; j++) {
            int c = 1;
            for (int s = 0; s < size; s++) {
                if(s==size-1 && c<cols) {
                    c++;
                    s = -1;
                }
                if (j == 0 || j == size - 1 || s == 0 || s == size - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(j==size-1 && r<rows){
                j=-1;
                r++;
            }
            System.out.println();
        }
    }
}
