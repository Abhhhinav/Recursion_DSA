package Recursion;

public class BinaryStr {
    public static void Bin(int n, int last , String str) {
       if(n==0){
        System.out.println(str);
        return;
       }
       Bin(n-1, 0, str+ "0");
       if(last==0){
        Bin(n-1, 1, str + "1");
       }
     }
     public static void main(String[] args) {
          Bin(3, 0, " ");
     }
}
