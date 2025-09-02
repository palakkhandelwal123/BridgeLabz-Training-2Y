import java.util.*;
class friends{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] age =new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("enter age of "+i+" friend");
            age[i]=obj.nextInt();
            System.out.println("enter height of "+i+" friend");
            height[i]=obj.nextInt();
        }
        for(int i=1;i==1;i++){
            if(age[i]<age[i+1] && age[i]<age[i+2]){
                System.out.println("first friend is younger");
            }
            else if(age[i+1]<age[i] && age[i+1]<age[i+2]){
                System.out.println("second friend is younger");
            }
            else
                System.out.println("third friend is younger");
        }
        for(int i=1;i==1;i++){
            if(height[i]>height[i+1] && height[i]>height[i+2]){
                System.out.println("first friend is tallest");
            }
            else if(height[i+1]>height[i] && height[i+1]>height[i+2]){
                System.out.println("second friend is tallest");
            }
            else
                System.out.println("third friend is tallest");
        }
    }
}