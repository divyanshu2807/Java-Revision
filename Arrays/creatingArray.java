package javaRevision.Arrays;

import java.util.Scanner;

public class creatingArray {
    public static void main(String[] args) {
        // Creating an Array

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.println("length of an Array: " + marks.length);// for calculating the Array length

        marks[0] = sc.nextInt(); // input for Array
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: " + marks[0]); // output for array
        System.out.println("che: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        marks[1] = 100; // updating an Array
        System.out.println("che: " + marks[1]);


        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage: " + percentage + "%");

        // ! way of Creating an Array
        // int numbers[] = { 1, 2, 3 };

        // int moreNumbers[] = { 4, 5, 6 };

        // String fruits[] = { "Apple", "Banana", "Orange" };

    }
}
