package arrays.SlidingWindowTech;

public class IsSumPresent {
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,5};
                   
        System.out.println(isSubSum(arr, 34));


    }

    public static boolean isSubSum(int arr[],int sum){
        int currSum=arr[0];
        int start=0;

        for(int end=1;end<arr.length;end++){
            while(currSum>sum && start<end-1){
                currSum=currSum-arr[start];
                start++;
            }
            if(sum==currSum){
                return true;
            }
            if(end<arr.length){
    currSum=currSum+arr[end];

            }
        }

        return currSum==sum;
    }
    
}
