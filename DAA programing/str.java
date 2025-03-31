public class str {
   public static void main(String[] args) {
    String s="";
    solve(4,s);
   } 
   static void solve(int n,String s){
    if(s.length()==n){
        System.out.println(s);  
        return;
    }
    solve(n, s+'0');
    if((s.length()>0&&s.charAt(s.length()-1)!='1')||s.length()==0){
        solve(n, s+'1');
    }
   }
}

