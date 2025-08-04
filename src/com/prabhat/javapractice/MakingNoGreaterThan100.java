package com.prabhat.javapractice;

//Take a number and repeatedly add 10 using += till the number becomes more than 100.

import java.util.Scanner;

public class MakingNoGreaterThan100 {

   public static void hasNumberBecameGreaterThan100(int num){

       if(num>100){
           System.out.println("The Number Entered Is Greater Than 100.");
           return;
           }

           while (num<=100){
              num += 10;
              System.out.println("The Number Has Now Became: "+num);

           }
               System.out.println("The Number Has Now Became Greater Than 100: Number= "+num);
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter The Number: ");
        int num= sc.nextInt();
        hasNumberBecameGreaterThan100(num);

    }

}
