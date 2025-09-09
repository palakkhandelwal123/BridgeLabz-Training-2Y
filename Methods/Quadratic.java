import java.util.Scanner;

public class Quadratic {
    public static void findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
            return;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Discriminant = " + discriminant);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        findRoots(a, b, c);

        sc.close();
    }
}
