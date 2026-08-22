package javaRevision.functions;

import java.util.Scanner;

public class binomialCoefficient {

    public static int BinomialCoefficient(int n, int r) {

        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);

        int BinomialCoefficient = fact_n / (fact_r * fact_nmr);

        return BinomialCoefficient;

    }

    public static int Factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {

        System.out.println(BinomialCoefficient(5, 2));
    }
}
