package com.prabhat.javapractice;

import java.util.Scanner;

public class CheckVotingEligiblity{

    public static void votingEligiblity(double age) {

        if(age==-1){
            System.out.println("Exiting the Program");

        }


        else if((age<=0) || (age>120)){
            System.out.println("Please Check The Age And Re-enter The Valid Age");
        }
        else if ((age >= 18) ) {
            System.out.println("Congratulation You Are Eligible To Vote");
        } else {
            System.out.println("Sorry You Are Not Eligible To Vote");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Your Age: ");
            double age= sc.nextDouble();
            votingEligiblity(age);
            System.out.println("\n");

            if( age ==-1){
                System.out.println("Exiting The Program. Goodbye!");
                break;
            }

        }
        sc.close();
    }

}
