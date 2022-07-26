package sorting;

import java.util.Arrays;

public class MinArray {
    public static void main(String[] args) {
        int arr[]={10,8,1,4};
        System.out.println(minDiff(arr));
       
        
    }
    public static int minDiff(int arr[]){
    int n=arr.length;
    Arrays.sort(arr);   
    
    int res=Integer.MAX_VALUE;

    for(int i=1;i<n;i++){
        res=Math.min(res, arr[i]-arr[i-1]);
    }
  

   return res;
} 
}
