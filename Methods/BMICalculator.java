import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

 
    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int teamSize = 10;
        double[] heights = new double[teamSize];
        double[] weights = new double[teamSize];
        double[] bmis = new double[teamSize];
        String[] statuses = new String[teamSize];

        for (int i = 0; i < teamSize; i++) {
            System.out.println("\nEnter details for member " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            weights[i] = sc.nextDouble();

            bmis[i] = calculateBMI(weights[i], heights[i]);
            statuses[i] = getStatus(bmis[i]);
        }

        System.out.println("\n--- Team BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < teamSize; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                              heights[i], weights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }
}
