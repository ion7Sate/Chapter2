package com.company;
import java.util.Scanner;
public class NegativePositiveAndZeroNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int pNumbers=0;
        int nNumbers=0;
        int zNumbers=0;

        System.out.println("Enter firs number");
        a=input.nextInt();

        System.out.println("Enter second number");
        b=input.nextInt();

        System.out.println("Enter third number");
        c=input.nextInt();

        System.out.println("Enter fourth number");
        d=input.nextInt();

        System.out.println("Enter the fifth");
        e=input.nextInt();

        if(a>0){
            pNumbers++;
        }
        if(a<0){
            nNumbers++;
        }
        if(a==0){
            zNumbers++;
        }
        if(b>0){
            pNumbers++;
        }
        if(b<0){
            nNumbers++;
        }
        if(b==0){
            zNumbers++;
        }
        if(c>0){
            pNumbers++;
        }
        if(c<0){
            nNumbers++;
        }
        if(c==0){
            zNumbers++;
        }
        if(d>0){
            pNumbers++;
        }
        if(d<0){
            nNumbers++;
        }
        if(d==0){
            zNumbers++;
        }

        if(e>0){
            pNumbers++;
        }
        if(e<0){
            nNumbers++;
        }
        if(e==0){
            zNumbers++;
        }

        System.out.println("Positive numbers: "+pNumbers);
        System.out.println("Negative numbers: "+nNumbers);
        System.out.println("Zero numbers: "+zNumbers);

    }
}
