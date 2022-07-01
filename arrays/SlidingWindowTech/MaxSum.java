package arrays.SlidingWindowTech;

public class MaxSum {
    public static void main(String[] args) {
        int arr[]={1, 8, 30, -5, 20, 7};

        System.out.println(findMaxSum(arr, 3));
    }

    public static int findMaxSum(int arr[],int k){
        int curr_sum=0;

        for(int i=0;i<k;i++){
            curr_sum=curr_sum+arr[i];
        }
        int maxSum=curr_sum;

        for(int i=k;i<arr.length;i++){
            curr_sum=curr_sum+arr[i]-arr[i-k];
            maxSum=Math.max(curr_sum, maxSum);
        }
        return maxSum;
    }
    
}
