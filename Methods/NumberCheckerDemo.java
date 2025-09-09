import java.util.Scanner;

class NumberChecker {
    public static String checkSign(int num) {
        if (num > 0) return "Positive";
        else if (num < 0) return "Negative";
        else return "Zero";
    }

    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static long factorial(int num) {
        if (num < 0) return -1; 
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

public class NumberCheckerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Sign: " + NumberChecker.checkSign(num));
        System.out.println("Even/Odd: " + NumberChecker.checkEvenOdd(num));
        System.out.println("Prime: " + (NumberChecker.isPrime(num) ? "Yes" : "No"));
        System.out.println("Factorial: " + NumberChecker.factorial(num));
        System.out.println("Sum of digits: " + NumberChecker.sumOfDigits(num));

        sc.close();
    }
}
