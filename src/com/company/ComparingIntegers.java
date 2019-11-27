package com.company;
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter first number");
        number1 = input.nextInt();

        System.out.println("Enter second number");
        number2 = input.nextInt();

        if(number1 == number2) {
            System.out.println("These numbers are equal");
        }

        if(number1 > number2) {
            System.out.println("First number is larger");
        }

        if(number1<number2) {
            System.out.println("Second number is larger");
        }



    }
}
