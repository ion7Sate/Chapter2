package com.company;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a; //first number
        int b; //second number

        System.out.println("Enter first number");;
        a=input.nextInt();

        System.out.println("Enter second number ");
        b=input.nextInt();

        if(a % 2==0){
            System.out.println(a +" is even number");
        }
        else System.out.println(a+" is odd number");

        if(b % 2==0){
            System.out.println(b +" is even number");
        }
        else System.out.println(b+" is odd number");


    }
}
