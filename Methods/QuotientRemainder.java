import java.util.Scanner;

public class QuotientRemainder {

    public static int getQuotient(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static int getRemainder(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int quotient = getQuotient(dividend, divisor);
            int remainder = getRemainder(dividend, divisor);

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }

        sc.close();
    }
}
