package searching;

public class CountOccurance  {
    public static void main(String[] args) {
        int arr[]={10,15,20,20,20,40,40};
        System.out.println(countOccurance(arr, 10));
    }
    public static int lastOccurance(int arr[] ,int x){
        int low=0;int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            } else if(arr[mid]>x){
                high=mid-1;
            } else{
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                } else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static int firstOccurance(int arr[],int x){
        int low=0;
        int high=arr.length-1;

        while(low <=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                if(mid==0 ||arr[mid]!=arr[mid-1]){
                 return mid;
                } else{
                    high=mid-1;
                }
            } else if(arr[mid]>x){
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return -1;
    }

public static int countOccurance(int arr[],int x){
    
    int first=firstOccurance(arr, x);
    if(first==-1) return 0;
  else 
  return (lastOccurance(arr, x)-first+1);

}
    
}
