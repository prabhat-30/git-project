package com.prabhat.javapractice;
import java.util.Scanner;

public class CheckingNoOf1s {

    public static  int NoOf1s(int num){
        int count=0;
        while (num !=0){
            num=num & (num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter The Number to check no. of ones (or Enter -1 to exit ): ");
            int num = sc.nextInt();

          if(num==-1){
              System.out.println("Exiting The Program-------------------------");
              break;
          }
            System.out.println("Number of 1s in binary representation of " + num + " is: " + NoOf1s(num));
        }
        sc.close();
    }
}
