import java.util.*;

public class vowelconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch>='A' && ch<='z')){
                char lower = Character.toLowerCase(ch);
                if(lower == 'a'|| lower == 'e'|| lower == 'i'|| lower =='o'|| lower == 'u'){
                    System.out.println(ch + "is a Vowel");
                }
                else{
                    System.out.println(ch +"is a consonant");
                }
            }
            else{
                System.out.println(ch + "is not a letter");
            }
        }

    }
}
