package arrays.gfg_problems;

public class Rearrange {
    public static void main(String[] args) {
        long arr[]={1,2,3,4,5,6};
          rearrange(arr, arr.length);
          for (long l : arr) {
            System.out.print(l+" ");
            
          }
    }
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int max_index=n-1;
        int min_index=0;
        long max=arr[n-1]+1;
        
        
        for(int i=0;i<n;i++){
            if(i%2==0)
            {
                arr[i]=(arr[max_index]%max)*max+arr[i];
                max_index--;
            }
            else{
              arr[i]=(arr[min_index]%max)*max+arr[i];
                min_index++;
        }
        } 
        
        for(int i=0;i<n;i++){
            arr[i]/=max;
        }
        
    }
    
}
