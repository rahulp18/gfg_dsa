package arrays.gfg_problems;

public class CheckISSortedAndRotated {
    public static void main(String[] args) {
        int arr[]={30,20,10,50,35};
        System.out.println(checkRotatedAndSorted(arr, arr.length));
        // checkRotatedAndSorted(arr, arr.length);
    }
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        if(arr.length==1) return false;
        
        int count=0;
        
        if(arr[num-1]<arr[0]){
            for(int i=1;i<num;i++){
                if(arr[i] <arr[i-1])
                count++;
                // System.out.println(arr[i]+" increasing"+arr[i-1]);
            }
            
        }
        else{
            for(int i = 1; i < num; i++) {
                if(arr[i] > arr[i- 1]){
                    count++;
                 

                }
            }
        }
        return count==1?true:false;
    }
    
}
