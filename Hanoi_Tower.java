package Recursion;

public class Hanoi_Tower {
    public static void Han(int n, String src, String help, String Des) {

        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + Des);
            return;
        }
        Han(n - 1, src, Des, help);
        System.out.println("Transfer disk " + n + " from " + src + " to " + Des);
        Han(n - 1, help, src, Des);
    }
    public static void main(String[] args) {
        int n = 3;
        Han(n, "S", "H", "D");
    }
}
