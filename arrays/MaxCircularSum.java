package arrays;

public class MaxCircularSum {
    public static void main(String[] args) {
        
    }
    
    public static int maxSubarray(int arr[],int n){
        int res = arr[0];

    	for(int i = 0; i < n; i++)
    	{
    		int curr_max = arr[i];
    		int curr_sum = arr[i];

    		for(int j = 1; j < n; j++)
    		{
    			int index = (i + j) % n;

    			curr_sum += arr[index];

    			curr_max = Math.max(curr_max, curr_sum);
    		}

    		res = Math.max(res, curr_max);
    	}
    	return res;

    }
}
