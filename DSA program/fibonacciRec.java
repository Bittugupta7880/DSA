import java.util.*;
public class fibonacciRec {
public static void fibonacciSequence(int a, int b, int n){
    
   if (0==n) {
    return ;
    
   }
   int c=a+b; 
   System.out.print(c+" ");

   fibonacciSequence(b, c, n-1);
}

    public static void main(String[] args) {
       int a=0,b=1;

Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
       System.out.print(0+" ");
       System.out.print(1+" "); 
       fibonacciSequence(a,b,n-2);
    }
}
