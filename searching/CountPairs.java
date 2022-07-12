package searching;

import java.util.Arrays;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr= {1,1,1,1};
        Arrays.sort(arr);
        System.out.println(CountPairsSum(arr,2));
        // System.out.println(count(arr,7));
    }
    // public static int count(int arr[],int x){
    //     int low=0;int high=arr.length-1;
    //     int countP=0;
    //        while(low<high){
    //         if(arr[low]+arr[high]==x){
    //             countP++;
    //             if(arr[high]==arr[high-1]){
    //                 high--;
    //             } else if(arr[low]==arr[low+1]){
    //                 low++;
    //             } else{
    //                 high--;
    //                 low++;
    //             }
    //         } else if(arr[high]+arr[low]>x){
    //             high--;
    //         } else{
    //             low--;
    //         }
    //        }
  

    //     return countP;
    // }

    public static int CountPairsSum(int arr[],int sum){
        int count=0;
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
