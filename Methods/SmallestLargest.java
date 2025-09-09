import java.util.Scanner;

public class SmallestLargest {
    public static int findSmallest(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        return smallest;
    }

    public static int findLargest(int a, int b, int c) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int smallest = findSmallest(num1, num2, num3);
        int largest = findLargest(num1, num2, num3);

        System.out.println("Smallest number = " + smallest);
        System.out.println("Largest number = " + largest);

        sc.close();
    }
}
