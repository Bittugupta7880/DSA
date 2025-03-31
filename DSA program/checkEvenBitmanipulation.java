import java.util.*;
public class checkEvenBitmanipulation{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("please enter the number" );
int n=sc.nextInt();
if((n & 1)==0){
    System.out.println(n  +" "+  "is even number");

}
else{
    System.out.println(n  +" "+  "is not even number");
}
        
    }
    
}
