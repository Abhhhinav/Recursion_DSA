package Recursion;

public class sum {
    public static void natural(int i , int n, int sum){
        
        if(i==n){
        sum = sum+i;
        System.out.println(sum);
        return;
        }

        sum = sum + i;
        natural(i+1, n, sum);
    }
    public static void main(String args[]){
        natural(1,5,0);
    }
}
