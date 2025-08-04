package com.prabhat.javapractice;
import java.util.Scanner;

public class PrintingDays {
    public static void findingDay(int num){
        switch(num){
            case 1:{
                System.out.println("Hey! Today is Monday.");
                break;
            }
            case 2 :{
                System.out.println("Hey! Today is Tuesday.");
                break;
            }
            case 3 :{
                System.out.println("Hey! Today is Wednesday.");
                break;
            }
            case 4 :{
                System.out.println("Hey! Today is Thursday.");
                break;
            }
            case 5 :{
                System.out.println("Hey! Today is Friday.");
                break;
            }
            case 6 :{
                System.out.println("Hey! Today is Saturday.");
                break;
            }
            case 7 :{
                System.out.println("Hey! Today is Sunday.");
                break;
            }
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number between \"1-7\" to find the Day or Enter \"-1\" to exit the program: ");
            int num = sc.nextInt();
            if (num == -1) {
                System.out.println("Exiting the program-----------------------");
                return;
            }
            else if (num >= 1 && num <= 7) {
                findingDay(num);
            }else {
                System.out.println("❌ Please enter the valid number between \"1-7\".");
            }
            sc.close();
        }
    }
}
