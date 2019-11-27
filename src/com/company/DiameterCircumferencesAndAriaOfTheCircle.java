package com.company;
import java.util.Scanner;
public class DiameterCircumferencesAndAriaOfTheCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.println("Enter the radius of the circle:");
        radius = input.nextInt();

        System.out.println("Diameter: "+2*radius);
        System.out.println("Circumferences: "+2*Math.PI*radius);
        System.out.println("Aria: "+Math.PI*Math.pow(radius,2));




    }
}

