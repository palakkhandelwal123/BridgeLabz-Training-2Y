import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();


        if (temperature <= 50 && windSpeed >= 3) {
            double wct = calculateWindChill(temperature, windSpeed);
            System.out.println("Wind Chill Temperature = " + wct);
        } else {
            System.out.println("Invalid input! Condition: T <= 50 and V >= 3.");
        }

        sc.close();
    }
}
