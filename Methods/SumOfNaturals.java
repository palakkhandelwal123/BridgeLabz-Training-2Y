import java.util.Scanner;

public class SumOfNaturals {
    public static int recursiveSum(int n) {
        if (n == 0)
            return 0; 
        else
            return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

 
        int sumRecursive = recursiveSum(n);

        int sumFormula = formulaSum(n);

        System.out.println("Sum of first " + n + " natural numbers (Recursive) = " + sumRecursive);
        System.out.println("Sum of first " + n + " natural numbers (Formula)   = " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println(" Both methods give the same result. Correct!");
        } else {
            System.out.println(" Results are different. Check logic!");
        }

        sc.close();
    }
}
