package com.prabhat.javapractice;

public class TypecastingUsingInheritance {
   static class Animal {
           void feel() {
            System.out.println("Animal has feelings");
        }

    }

     static class Dog extends Animal {
        public static void bark() {
            System.out.println("Dog is barking");
        }

        public static void eat() {
            System.out.println("Dog is eating");
        }

        void walk() {
            System.out.println("Dog is walking.");
        }
         void feel() {
             System.out.println("Dog has feeling.");
         }
    }

    public static void main(String[] args) {
      Dog d= new Dog();//object of class dog "d" is made to call non-static method of dog class.
        d.feel();//object calls non-static methods.
        d.walk();
        d.feel();
        Dog.eat();//Static Methods are called by class name
        Dog.bark();
        Animal b=new Animal();
        b.feel();
        System.out.println("---------------------------------------------");

        Animal a = new Dog();
        a.feel();
        if (a instanceof Dog) {
            Dog d1 = (Dog) a;
            d1.walk();
            d1.feel();
            Dog.eat();
            Dog.bark();
        }
    }

}