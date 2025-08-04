package com.prabhat.javapractice;

import java.util.Scanner;

public class triangle_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of line you want to print");
        int n = sc.nextInt();
        for (int i =1; i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i =n; i>=1;i--){
            for (int j=i ; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
