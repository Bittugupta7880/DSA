
 
class GFG {
 
    
    public static int search()
    {
        int arr[] = { 2, 3, 4, 10, 40 };
 
        
        int x = 10;
        int n = arr.length;
 
       
        for (int i = 0; i < n; i++) {
 
            
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
   
    public static void main(String args[])
    {
       
      
 
      
        int result = search( );
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present"
                             + " at index "
                             + result);
      
    }
}
