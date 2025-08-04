package com.prabhat.javapractice;

import java.util.Scanner;

public class PrintingNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please the maximum range till which you want to chek the number divisible by both 5 and 7: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++) {
            if (i % 5==0 && i%7==0){
                System.out.println("Number "+i+" is divisible by both 5 and 7");
            }else{
                System.out.println(i);
            }
        }
    }
}
