import java.util.Scanner;
public class natural_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 0) {
            int sum = num * (num + 1) / 2;
            System.out.println("The number is natural.");
        } else {
            System.out.println("The number is not natural.");
        }
    }
}