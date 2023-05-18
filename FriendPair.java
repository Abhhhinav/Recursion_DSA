package Recursion;
public class FriendPair {
    public static int pair(int n) {
       if(n==1||n==2){
        return n;
       }
       int fnm1 = pair(n-1);
       int fnm2 = pair(n-2);
       int total = fnm1 + (n-1) * fnm2; 
       return total;
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
