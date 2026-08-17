package Operators;

public class unary {
    public static void main(String[] args) {
        int a = 10;

        int b = ++a;
        System.out.println(a);
        System.out.println("the value of b is " + b);

        a++;

        System.out.println("After increment = " + a);

        a--;
        System.out.println("After decrement = " + a);
    }
}
