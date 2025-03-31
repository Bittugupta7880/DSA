import java.util.*;

class Removeduplication {
public static void fun(int []arr){
    Set<Integer> removed = new HashSet<Integer>();
//    for(int i:arr){
//     removed.add(i);
//    }
   
//    System.out.println(removed);
//   List<Integer> removed = new ArrayList<>();
    int n=arr.length;
    for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++) {
            if(arr[i]==arr[j]&&i!=j){
              c++;
            }
        }
        if(c>0){
                        removed.add(arr[i]);
        }
    }
    System.out.println(removed);
}



    public static void main(String[] args) {
        int []arr={1,2,2,3,3,4,5,6,7,8};
    fun(arr);

        
    }
}
