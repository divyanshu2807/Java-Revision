package looping;

public class continueKeyword {
    public static void main(String[] args) {
        System.out.println("hello world");
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
}
