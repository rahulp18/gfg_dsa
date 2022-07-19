package searching.Problems;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
      int  A[] = {1,2,3,7,5};
      int N = 5, S = 12;
      System.out.println(subarraySum(A,N,S));

    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        
        ArrayList<Integer>res=new ArrayList<Integer>();
        
        int curr_sum=arr[0],start=0;
        
        for(int end=1;end<=n;end++){
            while(curr_sum>s && start<end-1){
                curr_sum=curr_sum-arr[start];
                start++;
            }
            if(s==curr_sum){
                res.add(start+1);
                res.add(end);
                return res;
            }
              if(end<n){
                  
    curr_sum=curr_sum+arr[end];
              }

            
        }
        res.add(-1);
        return res;
        
    }
}
