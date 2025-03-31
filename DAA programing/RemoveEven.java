import java.util.Arrays;

public class RemoveEven {
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        
        // Count the odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        // Create a result array to hold odd numbers
        int[] result = new int[oddCount];
        int idx = 0;
        
        // Fill the result array with odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        
        return result; // Return the result array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Call the removeEven method and store the result
        int[] oddNumbers =removeEven(arr);
        
        // Print the resulting array
        System.out.println(Arrays.toString(oddNumbers));
    }
}