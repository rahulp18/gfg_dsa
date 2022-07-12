package searching;

public class TwoPointerAlgo {
    public static void main(String[] args) {
        int arr[]={2,3,5,8,9,10,11};
        System.out.println(findSum(arr, 17));
    }
    public static boolean findSum(int arr[],int x){
         int low=0;
         int high=arr.length-1;

         while(low<high){
            int sum=arr[low]+arr[high];
            if(sum<x){
                low++;
            } else if(sum>x){
                high--;
            } else{
                return true;
            }
         }

         return false;

    }
    
}
