package looping;

import java.util.Scanner;

public class sum {
    // sum of first N natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
        int num = sc.nextInt();
       
        int sum = 0;

        int counter = 1;
        while (counter <= num) {
            sum = sum + counter;
            System.out.println(sum);
            counter++;
        }

        System.out.println("the sum is:" +sum);
    }
}
