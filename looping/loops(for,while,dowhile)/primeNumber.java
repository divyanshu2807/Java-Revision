package looping;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true; // Assumed our number is prime

            for (int i = 2; i <= n - 1; i++) { // we also use the termination condition math.sqrt(n)
                if (n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

    }
}
