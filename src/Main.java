
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }

        }
    }





}