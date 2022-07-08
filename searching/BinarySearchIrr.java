package searching;

public class BinarySearchIrr {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
System.out.println(binarySearch(arr, 50));
    }
    public static int binarySearch(int arr[],int ele){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                low=mid+1;
            }
            else if(arr[mid]>ele){
                high=mid-1;
            }
        }
return -1;
    }
    
}
