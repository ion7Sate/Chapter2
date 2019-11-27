package com.company;
import java.util.Scanner;
public class LargestAndSmallestInteger {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;

        System.out.println("Enter first number");
        a=input.nextInt();

        System.out.println("Enter second number");
        b=input.nextInt();

        System.out.println("Enter third number");
        c=input.nextInt();

        System.out.println("Enter fourth number");
        d=input.nextInt();

        System.out.println("Enter the fifth");
        e=input.nextInt();

        int max=a;
        int min=a;
        if(b > max){
            max=b;
        }
        if(c > max){
            max=c;
        }
        if(d > max){
            max=d;
        }
        if(e > max){
            max=e;
        }

        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        if(d<min){
            min=d;
        }
        if(e<min){
            min=e;
        }
        System.out.println("The largest number is: "+max);
        System.out.println("The smallest number is: "+min);
    }
}
