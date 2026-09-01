package javaRevision.Arrays;

public class smallestArray {

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // it represents  plus infinity

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 8, 3, 6 };

        System.out.println("the smallest value is: " + getSmallest(numbers));

    }
}
