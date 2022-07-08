package searching;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        System.out.println( Search(arr,0,arr.length-1, 50));
    }
    public static int Search(int arr[],int low,int high,int ele){
        if(low>high) return -1;

        int mid=(low+high)/2;
    
        if(arr[mid]==ele) return mid;
        else if (arr[mid]>ele) return Search(arr, low, mid-1, ele);
        else   return Search(arr, mid+1, high, ele);
    }
    
}
