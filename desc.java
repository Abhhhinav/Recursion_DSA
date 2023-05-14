package Recursion;

public class desc {
    public static void des(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        des(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        des(n);
    }
}
