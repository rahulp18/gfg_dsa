package arrays.gfg_problems;

public class MinDiffInCircularArray {
    public static void main(String[] args) {
        int arr[]={10, 12, 13, 15, 9};

        System.out.println(minAdjDiff(arr, arr.length));
    }
      // n: size of array
      public static int minAdjDiff(int arr[], int n) {
        
        // Your code here
      if(n<2) return -1;
       
       int res=Math.abs(arr[1]-arr[0]);
       
       for(int i=2;i<n;i++){
          res=Math.min(res,Math.abs(arr[i]-arr[i-1]));
       }
        res=Math.min(res,Math.abs(arr[n-1]-arr[0]));
        return res;
    }
}
