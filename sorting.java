package Recursion;

public class sorting {
    public static boolean isSort(int arr[] , int i) {
       if(i == arr.length-1){
         return true;
       }
       if(arr[i]>arr[i+1]){
        return false;
       }
       return isSort(arr, i+1);
    }
    public static void main(String[] args) {
         int arr[] = {5};
         System.out.println(isSort(arr, 0));   
    }
}
