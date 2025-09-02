import java.util.*;
class largest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = obj.nextInt();

        int[] digits = new int[10];
        int i = 0;

        while(n != 0) {
            int digit = n % 10;
            digits[i] = digit;
            i++;
            n = n / 10;
            if(i == 10) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for(int j = 0; j < i; j++) {
            int d = digits[j];   
            if(d > largest) {
                secondLargest = largest;
                largest = d;
            } else if(d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
    }
}
