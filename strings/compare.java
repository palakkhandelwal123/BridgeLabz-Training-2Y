// package stringassignment;
import java.util.*;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  name1 = sc.next();
        String name2 = sc.next();

        boolean bro = true;
        if(name1.length() == name2.length()){
            for(int i=0;i<name1.length();i++){
                if(name1.charAt(i) != name2.charAt(i)){
                    bro = false;
                    break;
                }
                
            }
        }
        else{
                bro = false;
            }
        boolean builtIn = name1.equals(name2);

        
        System.out.println("\ncharAt() comparison: " + bro);
        System.out.println("equals() comparison: " + builtIn);
        
        sc.close();

    
    }
    
}
