public class DuplicateElement {  
    public static void main(String[] args) {  
            //Initialize array  
            int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
            System.out.println("Duplicate elements in given array: ");  
            //Searches for duplicate element 
            int count=0; 
            for(int i = 0; i < arr.length; i++) {  
                for(int j = 0; j < arr.length; j++) {  
                    if(arr[i] == arr[j])  

                        {
                            count++; 

                        }
                    }
                    if(count==0)
                    {
                    System.out.println(arr[i]);}


                } 
                
}
            }  
         
    
