import java.util.Scanner;

public class NumberAnalysis {
    public static void analyzeNumber(int num) {
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is Positive and Even");
            } else {
                System.out.println(num + " is Positive and Odd");
            }
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("Number is Zero (neither positive nor negative, even by definition)");
        }
    }

    public static void compareFirstLast(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];

        if (first == last) {
            System.out.println("First and Last elements are Equal");
        } else if (first > last) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            analyzeNumber(num);
        }

        System.out.println("\nComparison of First and Last:");
        compareFirstLast(numbers);

        sc.close();
    }
}
