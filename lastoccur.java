package Recursion;

public class lastoccur {
    public static int last(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isFound = last(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 42, 2, 2, 1, 1, 13, 2 };
        System.out.println(last(arr, 2, 0));
    }
}
