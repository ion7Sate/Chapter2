package com.company;
import java.util.Scanner;
public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.println("Enter first number");
        number1=input.nextInt();

        System.out.println("Enter second number");
        number2=input.nextInt();

        System.out.println("Enter third number");
        number3=input.nextInt();

        System.out.println("Sum is: "+Sum(number1,number2,number3));
        System.out.println("Difference is: "+Difference(number1,number2,number3));
        System.out.println("Product is: "+Product(number1,number2,number3));
        System.out.println("Division is: "+Division(number1,number2,number3));
        System.out.println("Maxim number is: "+getMax(number1,number2,number3));
        System.out.println("Minim number is: "+getMin(number1,number2,number3));
    }

    public static int Sum(int number1,int number2,int number3){
        return number1+number2+number3;
    }

    public static int Difference(int number1,int number2,int number3){
        return number1-number2-number3;
    }

    public static int Product(int number1,int number2,int number3){
        return number1*number2*number3;
    }

    public static int Division(int number1,int number2,int number3){
        return number1/number2/number3;
    }

    public static int getMin(int number1,int number2,int number3){
        return Math.min(Math.min(number1,number2),number3);
    }

    public static int getMax(int number1,int number2,int number3){
        return Math.max(Math.max(number1,number2),number3);
    }
}
