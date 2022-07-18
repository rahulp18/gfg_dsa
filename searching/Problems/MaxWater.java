package searching.Problems;

public class MaxWater {
    public static void main(String[] args) {
    int arr [] = {2,1,3,4,6,5};
    System.out.println(maxWater(arr, arr.length));
    }
    static int maxWater(int arr[], int n) 
    { 
        //Your code here
        int max=0;
        int low=0;int high=n-1;
        
        while(low<high){
            int waterPresent=(Math.min(arr[low],arr[high]))*(high-low-1);
            
            if(arr[low] <arr[high] ){
                low++;
            }
            else{
                high--;
            }
            max=Math.max(waterPresent,max);
        }
        return max;
    } 

    
}
