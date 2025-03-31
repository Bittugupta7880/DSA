class temp{
    public static void main(String[] args){
        int []arr={1,2,2,3,3,4,5,6,7,8};
        int [] result =new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    result[i]=arr[i];
                }
            }
        }
        for(int i=0; i<result.length; i++){
         System.out.print(result[i]);
        }
    }
}