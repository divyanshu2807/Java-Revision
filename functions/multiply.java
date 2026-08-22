package javaRevision.functions;

import java.util.Scanner;

public class multiply {


      public static void calculateProduct(int a, int b) { // parameters or formal parameters
        int product = a * b;
        System.out.println("The product of :" + product);
    } // function definition


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first no :");
        int a = sc.nextInt();

        System.out.println("enter the second no :");
        int b = sc.nextInt();

        calculateProduct(a, b);  
        
    }
}
