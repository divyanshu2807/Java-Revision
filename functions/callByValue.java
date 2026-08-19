package javaRevision.functions;

public class callByValue {
    public static void main(String[] args) {
        // swap - values exchange
        int a = 5;
        int b = 10;

        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


/* !  Important concept if we can pass the parameters to function like a and b then the value of a and b is change only inside the function there is no change 
    ! outside the function so  it is also known as call by value in java  !   */

// ! formal parameters is the  copy of actual parameter
