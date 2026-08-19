package looping;
// print the numbers 1 to n input taken from the user

import java.util.Scanner;

public class inputNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int counter = 1;

        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }

    }
}
