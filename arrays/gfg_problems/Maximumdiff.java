package arrays.gfg_problems;

public class Maximumdiff {
    public static void main(String[] args) {
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(maxIndexDiff(arr, arr.length));
    }
    static int maxIndexDiff(int arr[], int N) { 
        
        // Your code here
        int maxDiff=0;
        for(int start=0;start<N-1;start++){
            for(int end=N-1;end>start;end--){
                if(arr[start]<=arr[end]){
                    int diff=end-start;
                    if(maxDiff<diff) maxDiff=diff;
                }
            }
        }
        return maxDiff;
    }
    static int maxIndexDiff1(int arr[], int n) { 
        
        // Your code here
         int maxDiff;
        int i, j;
 
        int RMax[] = new int[n];
        int LMin[] = new int[n];
 
        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0];
        for (i = 1; i < n; ++i)
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
 
        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1];
        for (j = n - 2; j >= 0; --j)
            RMax[j] = Math.max(arr[j], RMax[j + 1]);
 
        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        i = 0;
        j = 0;
        maxDiff = -1;
        while (j < n && i < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            }
            else
                i = i + 1;
        }
 
        return maxDiff;
        
    }
    
}
