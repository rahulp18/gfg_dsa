package arrays;

public class MaxDiff {
    public static void main(String[] args) {
        int arr[]={30,10,8,2};
        // System.out.println(maximum(arr, arr.length));
        System.out.println(betterSolution(arr ));
    }

    public static int maximum(int arr[],int n){
        int max=Integer.MIN_VALUE;

            for(int j=n-1;j<n;j--){
                for (int i = 0; i < j; i++) {
                    int diff=arr[j]-arr[i];

                    if(max<diff) max=diff;
                    
                }
            }
            return max;
    }

    // Better Solution

    public static int betterSolution(int arr[] ){
        int res=arr[1]-arr[0];
        int minval=arr[0];
        for (int i = 1; i < arr.length; i++) {
            res=Math.max(res, (arr[i]-minval));
            minval=Math.min(minval, arr[i]);
        }
        return res;
    }
    
}
