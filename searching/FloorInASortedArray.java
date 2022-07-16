package searching;

public class FloorInASortedArray {
    public static void main(String[] args) {
        long arr[]= {1,2,8,10,11,12,19};
         
        System.out.println(findFloor(arr, arr.length, 5));
    }
    
    static int findFloor(long arr[], int n, long x)
    {
       int s=0,e=n-1,res=-1;
    while(s<=e){
        int mid = s + (e-s)/2;
        if(arr[mid]==x) return mid;
        else if(arr[mid]<x){
            res=mid;
            s=mid+1;
        }
        else if(arr[mid]>x) e = mid-1;
    }
    return res;
    }
}
