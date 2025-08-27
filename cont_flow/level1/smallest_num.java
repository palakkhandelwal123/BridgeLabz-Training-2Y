import java.util.Scanner ;
    public class smallest_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        if (n<m && n<s){
            System.out.println(n);
        } else if (m<n && m<s){
            System.out.println(m);
        } else if (s<n && s<m){
            System.out.println(s);
        }else{
            System.out.println("All numbers are equal");
        }

    }
}

