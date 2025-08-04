package com.prabhat.javapractice;

public class CheckIncrementOrDecrement {

    public static void CheckingIncrement(int a,int b) {
        System.out.println("PRE-INCREMENT AND POST INCREMENT");

        System.out.println("a=" + a + "---" + "b=" + b + "---------------1");
        a = ++a;
        System.out.println("a=" + a + "------------2");
        a = a++;
        System.out.println("a=" + a + "----------------3");
        System.out.println("b=" + b + "----------------4");
        b = b++;
        System.out.println("b=" + b + "----------------5");
        b = ++b;
        System.out.println("b=" + b + "----------------6");
        System.out.println("a=" + a + "----------------7");
        a = ++b;
        System.out.println("a=" + a + "----------------8");
        a = b++;
        System.out.println("a=" + a + "----------------9");
        System.out.println("b=" + b + "----------------10");
        b = a++;
        System.out.println("b=" + b + "----------------11");
        b = ++a;
        System.out.println("b=" + b + "----------------12");
        System.out.println("a=" + a + "---" + "b=" + b + "---------------FINAL");
    }
        public static void CheckingDecrement(int a,int b){
            System.out.println("PRE-DECREMENT AND POST DECREMENT");

            System.out.println("a=" + a + "---" + "b=" + b + "---------------1");
            a = --a;
            System.out.println("a=" + a + "------------2");
            a = a--;
            System.out.println("a=" + a + "----------------3");
            System.out.println("b=" + b + "----------------4");
            b = b--;
            System.out.println("b=" + b + "----------------5");
            b = --b;
            System.out.println("b=" + b + "----------------6");
            System.out.println("a=" + a + "----------------7");
            a = --b;
            System.out.println("a=" + a + "----------------8");
            a = b--;
            System.out.println("a=" + a + "----------------9");
            System.out.println("b=" + b + "----------------10");
            b = a--;
            System.out.println("b=" + b + "----------------11");
            b = --a;
            System.out.println("b=" + b + "----------------12");
            System.out.println("a=" + a + "---" + "b=" + b + "---------------FINAL");
        }


    public static void main(String[] args) {
        int a=10;
        int b=12;
        CheckingIncrement(a,b);
        CheckingDecrement(a,b);
        System.out.println("----------------------------------------------------------------------------");
        int c=12;
        int d=14;
        System.out.println("c="+c+"------------"+"d="+d);
        c=d++;
        System.out.println("c="+c+"------------"+"d="+d);
        c=++d;
        System.out.println("c="+c+"------------"+"d="+d);


    }
}
