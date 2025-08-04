package com.prabhat.javapractice;

import java.util.Scanner;

public class ArithmeticOperationPractice {

    public static void adding(double... a){
        double total=0;

        for(double x1:a){
            total=total+x1;
        }
        System.out.println("Total addition of the given number is:"+total);

    }

    public static void subtracting(double... a){
        double total=a[0];
        for(int i=1;i<a.length;i++){
            total=total-a[i];
        }
        System.out.println("Total subtraction of the given number is:"+total);
    }
    public static void multiplication(double... a){
        double total=1;

        for(double x1:a){
            total=(total*x1);
        }
        System.out.println("Total multiplication of the given number is:"+total);
    }

    public static void dividing(double... a){

        if(a.length<2){
            System.out.println("please enter at least two digit to perform the operation");
            return;
        }
        double result=a[0];

        for(int i=1; i<a.length;i++){

            if (a[i]==0){
                System.out.println("error: divide by zero not allowed.");
                return;
            }
            else{
                result = result / a[i];
            }
        }
        System.out.println("division of the given number is:"+result);
    }

    public static void findingMod(double... a){

        if(a.length<2){
            System.out.println("please enter at least two number:");
            return;
        }
        double result=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]==0){
                System.out.println("error: modulus by zero is not allowed:");
                return;
            }
            result=result%a[i];
        }
        System.out.println("modulus of the given number is:"+result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){

        System.out.println("Choose an option to Perform the operation");
        System.out.println("Enter 0: Exit");
        System.out.println("Enter 1: Addition");
        System.out.println("Enter 2: subtraction");
        System.out.println("Enter 3: Multiplication");
        System.out.println("Enter 4: Division");
        System.out.println("Enter 5: modulus");

        int choice =sc.nextInt();

        if(choice==0){
            System.out.println("exiting the program. Goodbye!");
            break;
        }

         System.out.println("enter the total number of values on which you want to perform the operation");
         int x = sc.nextInt();

         double[] number = new double[x];

         System.out.println("enter the values");

         for(int i=0;i<x;i++){
             System.out.print("number"+(i+1)+"=");
             number[i]= sc.nextDouble();
         }

        switch (choice) {

            case 1: {

                adding(number);
                break;

            }
            case 2:{

                subtracting(number);
                break;
            }
            case 3:{

                multiplication(number);
                break;
            }
            case 4:{

                dividing(number);
                 break;
            }
            case 5:{

                findingMod(number);
                break;
            }
            default: {
                System.out.println("Please enter the valid choice");
            }
        }
            System.out.println("\n");


        }
        sc.close();
    }
}




