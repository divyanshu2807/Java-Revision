package conditonal;

import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = sc.nextInt();

        if (income <= 250000) {
            System.out.println("No Tax");
        } else if (income <= 500000) {
            System.out.println("Tax = 5%");
        } else if (income <= 1000000) {
            System.out.println("Tax = 20%");
        } else {
            System.out.println("Tax = 30%");
        }
    }
}
