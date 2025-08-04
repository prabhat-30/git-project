package com.prabhat.javapractice;
import java.util.Scanner;

public class CheckingEvenOrOdd {

    public static void CheckEvenOrOdd(int num) {
        if ((num & 1) == 0) {
            System.out.println("The entered number " + num + " is even.");
        } else {
            System.out.println("The entered number " + num + " is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter The Number (or Enter -1 to exit): ");
            int num = sc.nextInt();

            if(num==-1){
                System.out.println("Exiting the program........");
                break;
            }
            CheckEvenOrOdd(num);
        }
        sc.close();
    }
}
