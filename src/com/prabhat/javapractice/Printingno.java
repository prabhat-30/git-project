package com.prabhat.javapractice;
import java.util.Scanner;

public class Printingno {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Please the maximum range till which you want to chek the number divisible by 3: ");
            int num=sc.nextInt();
            for (int i = 1; i <= num; i++) {
                if (i % 3 != 0) {
                    System.out.println(i);
                    continue;
                }
                System.out.println("Number "+i+" is divisible by 3.");
            }
        }
    }
