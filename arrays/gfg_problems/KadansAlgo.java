package arrays.gfg_problems;

public class KadansAlgo {
    public static void main(String[] args) {
        int arr[]={10,-3,-4,7,6,5,-4,-1};
        System.out.println(kadane(arr,arr.length));
        System.out.println(reverseKadane(arr, arr.length));
        System.out.println(circularSubarraySum(arr, arr.length));
    }
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }
     public static int kadane(int a[],int n){
        int res = 0;
        int x =  a[0];
        for(int i = 0; i < n; i++){
            res = Math.max(a[i],res+a[i]);
            x= Math.max(x,res);
        }
        return x;
    }
    public static int reverseKadane(int a[],int n){
        int total = 0;
      //taking the total sum of the array elements
        for(int i = 0; i< n; i++){
            total +=a[i];
             
        }
      // inverting the array
        for(int i = 0; i<n ; i++){
            a[i] = -a[i];
        }
        int k=kadane(a,n);
       int ress = total+k;
       // to handle the case in which all elements are negative
        if(total == -k ){
            return total;
        }
        else{
        return ress;
        }
         
    }

}
