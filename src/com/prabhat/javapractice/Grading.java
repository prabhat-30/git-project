package com.prabhat.javapractice;
import java.util.Scanner;

public class Grading {

    public static void marksBasedGrade(double avg){
        if(avg>=90) {
            System.out.println("Your Grade Is: A");
        }
        else if(avg>=80){
            System.out.println("Your Grade Is: B");
        }
        else if(avg>=70){
            System.out.println("Your Grade Is: C");
        }
        else if(avg<70){
            System.out.println("Your Grade Is: F---fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = 1;
        while (true) {
            System.out.print("PLEASE ENTER \"-1\" TO EXIT THE PROGRAM OR PRESS ANY OTHER NUMBER TO CONTINUE: ");
            int num= sc.nextInt();
            System.out.println();
            if(num==-1){
                System.out.println("EXITING-------------------------------");
                break;
            }
            System.out.println("Enter the details for student " + student +"\n");

            sc.nextLine(); // consume the leftover newline by nextInt(), nextDouble(), next()
            System.out.print("Name= ");
            String name = sc.nextLine();

            System.out.print("Roll no.= ");
            int roll_no = sc.nextInt();

            String university = "Chandigarh university";
            System.out.println("University Name="+ university +"\n");

            System.out.print("Enter Total Number Of Subjects: ");
            int sub = sc.nextInt();
            System.out.println("\n");

            double[] marks = new double[sub];
            double avg ;
            double total=0;
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter The Marks Of Subject " + (i+1) + "=");
                marks[i] = sc.nextDouble();
                total+=marks[i];
            }
            avg = Math.round((total / sub)*100.0)/100.0;
            System.out.println("\n---------- Result ----------");
            System.out.println("Student Name: " + name);
            System.out.println("Roll No: " + roll_no);
            System.out.println("Total Marks: " + total+"/"+100*sub);
            System.out.println("Average Marks: " + avg);
            marksBasedGrade(avg);
            System.out.println("----------------------------\n");
            student++;
        }
        sc.close();
    }
}
