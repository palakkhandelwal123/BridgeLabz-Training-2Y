import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine().replaceAll(" ", "").toLowerCase();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine().replaceAll(" ", "").toLowerCase();

        if (text1.length() != text2.length()) {
            System.out.println("The texts are NOT anagrams.");
            return;
        }

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }
    }
}
