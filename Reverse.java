package Recursion;

public class Reverse {
    public static void REv(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        REv(str, idx - 1);
    }

    public static void main(String args[]) {
        String str = " NEBRT";
        REv(str, str.length() - 1);
    }
}
