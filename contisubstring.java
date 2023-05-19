package Recursion;

public class contisubstring{
    public static int Cont(int n , int i, int j, String str){
       if(n==1){
         return 1;
       }
       if(n<=0){
        return 0;
       }
       int res = Cont(n-1, i+1, j, str) + Cont(n-1, i, j-1, str) - Cont(n-2, i+1, j-1, str);
       if (str.charAt(i) == str.charAt(j)){
          res++;
       }
       return res;
    }
    public static void main(String args[]){
        String str = "abcab";
        int n = str.length();
        System.out.println(Cont(n, 0, n-1, str));
    }
}
