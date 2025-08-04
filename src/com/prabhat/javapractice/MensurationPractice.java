package com.prabhat.javapractice;
import java.util.Scanner;

public class MensurationPractice{

  public static void area(int a ,int b){
      int i=a*b;
      System.out.println( "area of rectangle is:"+i);
  }
  public static void perimeter(int a , int b){
      int i = a + b;
      System.out.println("Perimeter of rectangle is:"+(2* i));
  }
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.print("enter the value of a:");
        int a = sc.nextInt();
        System.out.print("enter the value of b:");
        int b= sc.nextInt();

      area(a,b);
      perimeter(a,b);
    }
}