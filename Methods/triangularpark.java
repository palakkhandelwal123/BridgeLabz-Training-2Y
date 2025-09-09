// package java methods;
import java.util.*;

public class triangularpark{
    public static  int sides(double a,double b,double c, double distance) {
            double perimeter = a + b + c;
            double rounds = distance / perimeter;
            return (int) Math.ceil(rounds);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

          int rounds = sides(a, b, c, 5000);
          System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");
    }
  }

