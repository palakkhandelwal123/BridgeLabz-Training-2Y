// package stringassignment;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 += text.charAt(i);
        }
        String sub2 = text.substring(start, end);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println("Are both substrings equal? " + sub1.equals(sub2));

        sc.close();


    }
    
}
