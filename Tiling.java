package Recursion;

public class Tiling {
    public static int Tile(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1 = Tile(n-1);
        int fnm2 = Tile(n-2);
        int total = fnm1 + fnm2;
        return total;
    }
    public static void main(String args[]){
        System.out.println(Tile(4));
    }
}
