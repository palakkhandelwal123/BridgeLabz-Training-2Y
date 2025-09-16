import java.util.Scanner;
import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word= "";

        String[] customWords = new String[str.length()];
        int index=0;
        for(int i=0;i< str.length();i++){
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                if (!word.isEmpty()) {
                    customWords[index++] = word;
                    word = "";
                }
            }
        }
        if (!word.isEmpty()) {
            customWords[index++] = word;
        }

        String[] finalCustomWords = Arrays.copyOf(customWords, index);
        String[] builtInWords = str.split(" ");


        System.out.println("\nCustom split: " + Arrays.toString(finalCustomWords));
        System.out.println("Built-in split: " + Arrays.toString(builtInWords));

        System.out.println("Are both splits the same? " + Arrays.equals(finalCustomWords, builtInWords));

        sc.close();



    }
}
