package Recursion;

public class power {
    public static int optimizedpow(int a , int n) {
        int poweR;
        if(n==0){
            return 1;
        }
        int first = optimizedpow(a, n/2);
        if(n%2!=0){
               poweR = a * first * first;
        }
        else{
              poweR = first * first;
        }
        return poweR;
     }
     public static void main(String[] args) {
          System.out.println(optimizedpow(8,0));
     }
}
