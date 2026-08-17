package conditonal;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {

        // int age = 20;

        // if (age >= 18) {
        // System.out.println("You can vote");
        // } else {
        // System.out.println("You cannot vote");
        // }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }
}
