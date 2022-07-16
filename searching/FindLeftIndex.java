package searching;

public class FindLeftIndex {
    public static void main(String[] args) {
        int arr[] = {10,20,20,20,20,20,20};
        System.out.println(leftIndex(arr.length, arr, 10));
    }
    static int leftIndex(int N, int arr[], int x)
    {
       
       // Your code here
       int low=0;int high=N-1;
       
       while(low<=high)
       {
           int mid=(low+high)/2;
           
           if(arr[mid]>x) high=mid-1;
           else if(arr[mid]<x) low=mid+1;
           else{
               if(mid==0 || arr[mid] !=arr[mid-1]){
                   return mid;
               } else{
                   high=mid-1;
               }
           }
       }
       return -1;
   
    }
    
}
