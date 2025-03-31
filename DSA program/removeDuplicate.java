public class removeDuplicate {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicates(String str, int idx,String newString) {
    //base condition
    if(idx==str.length())
    {
        System.out.println(newString);
        return;
    }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, newString);

        }
        else{
            newString +=currchar;
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
       String str="abaacb";

       removeDuplicates(str, 0, "");
        
    }
    
}
