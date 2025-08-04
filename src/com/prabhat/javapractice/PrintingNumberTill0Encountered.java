package com.prabhat.javapractice;
import java.util.Scanner;

public class PrintingNumberTill0Encountered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nPlease Enter -1 to exit the program or any other number to continue: ");
            int a= sc.nextInt();
            if(a==-1){
                System.out.println("Exiting The Program---------------------------");
                break;
            }
            double num;
            double total = 0.0;
            double average = 0.0;
            int count = 0;
            do {
                System.out.print("Please enter the number: ");
                num = sc.nextDouble();
                if(num==0){
                    System.out.println("Zero Encountered");
                    break;
                }else {
                    total = total + num;
                    count++;
                }
            } while (num != 0);
            if(count>0){
                average=total/count;
            }
            System.out.println("-------------------Result--------------------");
            System.out.println("Total= " + total);
            System.out.printf("Average= %.2f" , average);
        }
    }
}
