package com.company;
import java.util.Scanner;
public class SeparatingDigitsOfInteger {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        number = input.nextInt();
        int n1 = number/10000;
        int n2 = number/1000%10;
        int n3 = number/100%10;
        int n4 = number/10%10;
        int n5 = number%10;
        System.out.println(n1+"\t"+n2+"\t"+n3+"\t"+n4+"\t"+n5);

    }
}
