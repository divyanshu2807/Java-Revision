package conditonal;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 60) {
            System.out.println("B Grade");
        } else if (marks >= 40) {
            System.out.println("C Grade");
        } else {
            System.out.println("Fail");
        }
    }
}
