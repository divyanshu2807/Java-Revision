import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter radius: ");
        // double radius = sc.nextDouble();

        // double area = Math.PI * radius * radius;

        // System.out.println("Area of Circle = " + area);

         Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius; // here we can use f beacause we can tell the java this is the float value

        System.out.println("Area of Circle = " + area);

    }
}


// when we are not  defined the given value is float or double then java automatically assume that the value is double value