package com.prabhat.javapractice;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number of Rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            // Print spaces (rows - i)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars (2*i - 1)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
