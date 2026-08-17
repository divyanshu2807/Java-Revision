public class Typecasting {
    public static void main(String[] args) {
        int marks = (int)(99.9f);
        int a = 25;
        // float b = a; // error 
        float b = (int)a;
        System.out.println(b);

    }
}
