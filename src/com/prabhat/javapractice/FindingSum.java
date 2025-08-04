package com.prabhat.javapractice;
import java.util.Scanner;

public class FindingSum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter the number: ");
        int num1=sc.nextInt();
        int num=Math.abs(num1);
        int preNum=num;
        int sum=0;
        int digit;
        int count=0;
        while (num !=0){
            num=num/10;
            count++;
        }
        System.out.println("Legth of the number: "+count);
        for (int i = 0; i< count; i++){
            digit=preNum%10;
            preNum=preNum/10;
            sum=sum+digit;
        }
        System.out.println("Sum of the Digit of Number is: "+sum);
    }
}
