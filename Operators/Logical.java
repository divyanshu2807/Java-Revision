package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // AND
        System.out.println(a < 20 && b > 10);

        // OR
        System.out.println(a > 20 || b > 10);

        // NOT
        System.out.println(!(a > b));
    }
}
