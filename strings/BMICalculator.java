import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; 

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(heightCm), String.valueOf(weight), String.valueOf(bmi), status};
    }

    public static String[][] calculateAllBMI(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            result[i] = calculateBMIStatus(hw[i][0], hw[i][1]);
        }

        return result;
    }

    public static void displayBMI(String[][] bmiData) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                    i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; 
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] bmiData = calculateAllBMI(hw);

        System.out.println("\n--- BMI Report ---");
        displayBMI(bmiData);

        sc.close();
    }
}
