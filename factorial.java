package Recursion;

public class factorial {
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        int factnm = fac(n-1);
        int fact = n * factnm;
        return fact;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(fac(n));
    }
}
