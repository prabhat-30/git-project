package com.prabhat.javapractice;

import java.util.Scanner;

public class CheckDivisibility {

    public static void IsDivisible(int num){

        if((num % 3==0)&&(num % 5==0)){
            System.out.println("The number"+" "+num+" "+"is divisible by both (3 and 5). "+"\n");

        }else{
            System.out.println("The number"+" "+num+" "+"is not divisible by both (3 and 5)."+"\n");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){

        System.out.print("Please Enter the Number to check the divisibility (or Enter -1 to Exit the Program): ");
        int num=sc.nextInt();


        if(num==-1){
            System.out.println("Exiting Program");
            break;
        }
            IsDivisible(num);

        }
        sc.close();
    }

}
