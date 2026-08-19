package looping;

public class Reversegiven {
    public static void main(String[] args) {
        int n = 66767;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10; // formua to find last Digit

            rev = (rev * 10) + lastDigit; 
            n = n / 10;  // formula to Remove last Digit 

        }

        System.out.println(rev);

    }
}
