package javaRevision.functions;

import java.util.Scanner;

public class sumFunction {

    public static void calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;
        System.out.println("The sum of :" + sum);
    } // function definition

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first no :");
        int a = sc.nextInt();

        System.out.println("enter the second no :");
        int b = sc.nextInt();

        calculateSum(a, b);  // Arguments or Actual parameters 
    }



    /*  * ! The second way of writing the same functions  */ 

    // public static int calculateSum(int num1, int num2) {
    //     int sum = num1 + num2;
    //     return sum;
    // } // function definition

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter the first no :");
    //     int a = sc.nextInt();

    //     System.out.println("enter the second no :");
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     // this sum is different variable and inside calculateSum is different variable

    //     System.out.println("The sum of :" + sum);
    // }
}