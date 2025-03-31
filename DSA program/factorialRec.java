import java.util.*;
public class factorialRec {
    public static int factorial(int n,int i){
        if (i==n) {
            return n;
        } 
       int fact_n= factorial(n,i+1);
       int fact=i* fact_n; 
       return fact;
            
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=1;
        System.out.println("enter the number");
int n=sc.nextInt();
      int ans= factorial(n,i);
      System.out.println(ans);
    }
}
