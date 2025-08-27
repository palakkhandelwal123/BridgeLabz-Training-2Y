import java.util.Scanner;

public class sum_until_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double value;

        System.out.println("Enter numbers to sum (enter 0 to stop):");
        value = scanner.nextDouble();

        while (value != 0) {
            total += value;
            value = scanner.nextDouble();
        }

        System.out.println("Total sum is: " + total);
    }
}
