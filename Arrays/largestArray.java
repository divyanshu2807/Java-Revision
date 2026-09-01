package javaRevision.Arrays;

public class largestArray {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // it represents -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 8, 3, 6 };

        System.out.println("the largest value is: " + getLargest(numbers));
    }
}
