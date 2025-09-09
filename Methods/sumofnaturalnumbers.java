// package java methods;
import java.util.*;

public class sumofnaturalnumbers {
    public static int sumnatural(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sumnatural(n));
    
    }
}
