package com.company;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first number");
        number1=input.nextInt();

        System.out.println("Enter second number");
        number2=input.nextInt();

        System.out.println("Sum is: "+Sum(number1,number2));
        System.out.println("Product is: "+Product(number1,number2));
        System.out.println("Difference is: "+Difference(number1,number2));
        System.out.println("Division is: "+Division(number1,number2));

    }
    public static int Sum(int number1,int number2){
        return number1+number2;
    }

    public static int Product(int number1,int number2){
        return number1*number2;
    }

    public static int Difference(int number1,int number2){
        return number1-number2;
    }

    public static int Division(int number1,int number2){
        return number1/number2;
    }

}
