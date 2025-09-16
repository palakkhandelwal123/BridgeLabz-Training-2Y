import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String customUpper = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); 
            }
            customUpper += ch;
        }

        String builtInUpper = text.toUpperCase();

        System.out.println("\nCustom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);

        System.out.println("Are both results same? " + customUpper.equals(builtInUpper));

        sc.close();
    }
}
