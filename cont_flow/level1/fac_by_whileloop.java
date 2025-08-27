import java.util.*;
public class fac_by_whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int fact =1;
        while (i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}