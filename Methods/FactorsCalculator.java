import java.util.Scanner;

public class FactorsCalculator {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int val : arr) {
            s += val;
        }
        return s;
    }

    public static int sumOfSquares(int[] arr) {
        int s = 0;
        for (int val : arr) {
            s += val * val;
        }
        return s;
    }


    public static long product(int[] arr) {
        long p = 1;
        for (int val : arr) {
            p *= val;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors of " + num + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Sum of factors = " + sum(factors));
        System.out.println("Sum of squares of factors = " + sumOfSquares(factors));
        System.out.println("Product of factors = " + product(factors));

        sc.close();
    }
}
