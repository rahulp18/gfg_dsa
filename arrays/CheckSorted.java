package arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,2};
        System.out.println(checkArray(arr, arr.length));
    }

    public static boolean checkArray(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
}
