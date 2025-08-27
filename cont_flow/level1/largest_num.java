import java.util.Scanner ;
    public class largest_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        if (n > m && n > s) {
            System.out.println("The first number is the largest.");
        } else if (m > n && m > s) {
            System.out.println("The second number is the largest.");
        } else {
            System.out.println("The third number is the largest.");
        }

    }
}
