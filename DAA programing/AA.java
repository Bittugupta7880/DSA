import java.util.*;

public class AA {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // System.out.println(Arrays.toSting(arr));
        // Call the reverseArray method with the array and its length
     
reverseArray(arr, arr.length);

        
        // Print the reversed array
        System.out.println(Arrays.toString(arr));
    }

    
    // Make the reverseArray method static
    public static void reverseArray(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        // for(int i=0; i<arr.length; i++)
        // {
        //    System.out.print(arr[i]+" ");
        // }
       
    }
}