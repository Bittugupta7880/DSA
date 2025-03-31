import java.util.*;
class B{

    public static int search()
    {
        int arr[]={1,2,3,4};
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=arr.length;
       while (n>0) {
        n=n/2;

        if(arr[n]==x){
            return n;
        }
       
            return -1;
         }
    }
    
            
        
        public static void main(String args[])
        {
            
int result=B.search();
if (result==-1){
    System.out.println("number are not in arry");
}
else{
    System.out.println("number of result ="+result);
}

        }
       

    };


