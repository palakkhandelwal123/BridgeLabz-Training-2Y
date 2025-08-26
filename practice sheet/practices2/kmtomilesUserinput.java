import java.util.Scanner;

public class kmtomilesUserinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;   // variable to store kilometers
        double miles;

        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();   // taking user input

        miles = km / 1.6;   // since 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}