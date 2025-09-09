import java.util.Scanner;

public class FootballTeamHeights {
    public static double findShortest(double[] heights) {
        double min = heights[0];
        for (double h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static double findMean(double[] heights) {
        double sum = 0;
        for (double h : heights) {
            sum += h;
        }
        return sum / heights.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] heights = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        double shortest = findShortest(heights);
        double tallest = findTallest(heights);
        double mean = findMean(heights);

        System.out.println("Shortest height: " + shortest + " m");
        System.out.println("Tallest height: " + tallest + " m");
        System.out.println("Mean height: " + mean + " m");

        sc.close();
    }
}
