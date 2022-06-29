package arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[]={-1,-3,-4,-5,-6};
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int arr[]){
        int n=arr.length;
        int res=arr[0];
        int maxSum=arr[0];

        for(int i=1;i<n;i++){
            maxSum=Math.max(maxSum+arr[i], arr[i]);
            res=Math.max(maxSum, res);
        }
        return res;
    }
    
}
