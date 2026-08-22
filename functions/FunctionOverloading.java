package javaRevision.functions;

public class FunctionOverloading {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int add = a + b + c;
        return add;
    }

    public static void main(String[] args) {

        System.out.println(sum(5, 6));
        System.out.println(sum(4, 5, 8));

    }
}
