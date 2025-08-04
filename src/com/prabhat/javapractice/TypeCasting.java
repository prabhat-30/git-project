package com.prabhat.javapractice;

public class TypeCasting {
    public static void main(String[] args) {
        int x=1939;
        System.out.println("Before assigning int to double, Number= "+x);
        double d=(double)x;
        System.out.println("After assigning int to double, Number= "+d);


        int y;
        y=(int)d;
        System.out.println("After assigning double to int, Number= "+y);
    }
}
