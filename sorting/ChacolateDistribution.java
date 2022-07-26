package sorting;

import java.util.Arrays;

public class ChacolateDistribution {
    public static void main(String[] args) {
        int arr[]={3,41,9,56,7,9,12};

        System.out.println(minDiff(arr, 3));
    }
    
    public static int minDiff(int arr[],int m){
        int n=arr.length;

        if(m>n) return -1;

        Arrays.sort(arr);
    int res=arr[m-1]-arr[0];
    for(int i=1;(i+m-1)<n;i++)
{
    res=Math.min(res,arr[i+m-1]-arr[i]);
}
return res;
    }
}
