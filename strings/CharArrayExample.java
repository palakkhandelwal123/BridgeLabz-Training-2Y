import java.util.Scanner;
import java.util.Arrays;

public class CharArrayExample {
    public static char[] toCharArrayCustom(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] customArray = toCharArrayCustom(text);
        char[] builtInArray = text.toCharArray();

        System.out.println(Arrays.toString(customArray));
        System.out.println( Arrays.toString(builtInArray));


        boolean same = Arrays.equals(customArray, builtInArray);
        System.out.println("\nAre both arrays equal? " + same);

        sc.close();
    }
}
