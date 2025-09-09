// package java methods;
import java.util.*;

public class checknumber {
    public static void checknumber(int num){
        if(num<0){
            System.out.println(num + " "+"is negative");
        }
        else if(num>0){
            System.out.println(num +" "+ "is positive");
        }
        else{
            System.out.println(num +" "+ "is zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        checknumber(number);
    }

}
