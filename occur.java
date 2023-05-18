package Recursion;

public class occur {
    public static void occ(int arr[], int idx, int key){
          if(idx == arr.length){
            return ;
          }
          if(key == arr[idx]){
            System.out.print(idx + " ");
          }
          occ(arr, idx+1, key);
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6,2,7,2,2};
        occ(arr,0,2);
        System.out.println();
    }
}
