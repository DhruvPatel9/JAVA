// Your First Program
import java.util.*;
class first_program {
    public static void pattern(int s){
        for(int i=0;i<=s;i++){
            for(int j=s;j>=0;j--){
                if(i<=j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(' ');
        }
    }
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
           
            System.out.print(' ');
          for(int j=i;j<=n;j++){
            System.out.print(' ');
            System.out.print(j);
          }
          System.out.println(' ');
          System.out.print(' ');
    }
    for(int i=n-1;i>=1;i--){
           
        System.out.print(' ');
      for(int j=i;j<=n;j++){
        System.out.print(' ');
        System.out.print(j);
      }
      System.out.println(' ');
      System.out.print(' ');
}
}
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number- ");  
        int a= sc.nextInt();  
        int b=2;
       pattern2(a);
    }
}