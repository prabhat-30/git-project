package com.prabhat.javapractice;

import java.util.Scanner;

public class CheckPrimeno {
    static int cnt = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a range to which you want to check if it's prime (-1 to exit): ");
            int n = sc.nextInt();

            if (n == -1) {
                System.out.println("Exiting -------------------------");
                break;
            }
         for (int i =1 ; i <=n; i++) {
             CheckPrime(i);
         }

         System.out.println("\n"+cnt);
        }

    }

    public static boolean CheckPrime(int i) {

        if (i <= 1) {
           // System.out.println("Number less than or equal to 1 is not a prime number.");
            return false;
        }


        boolean isPrime = true;
        int x = (int) Math.sqrt(i);
        //int cnt=
        for (int j = 2; j <= x; j++) {
            cnt++;
            if (i == 2 || i==3) {
                return true;
            }
            if (i % j == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
           System.out.print(i+",");

            return true;
        } else {
           // System.out.println(n + " is not a prime number");
            return false;
        }
    }
}
