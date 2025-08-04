package com.prabhat.javapractice;

import java.util.Scanner;

public class natural_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to sum the natural no.");
        int n = sc.nextInt();
        int sum=0;

        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
