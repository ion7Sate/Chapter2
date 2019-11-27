package com.company;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a; //first number
        int b; //second number

        System.out.println("Enter first number");;
        a=input.nextInt();

        System.out.println("Enter second number ");
        b=input.nextInt();

        if(a % b==0){
            System.out.println("Result is "+a/b);
        } else System.out.println("First number is not a multiple of the second");

    }

}
