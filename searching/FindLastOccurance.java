package searching;

public class FindLastOccurance {
    public static void main(String[] args) {
        int arr[]={10,15,20,20,40,40};
        System.out.println(recursiveWay(arr, 0, arr.length-1, 20));
        System.out.println(itrativeWay(arr,20));
    }
    public static int recursiveWay(int arr[],int low,int high,int x){
        if(low>high) return -1;

        int mid=(low+high)/2;
        if(arr[mid]==x){
            if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
                return mid;
            } else{
                return recursiveWay(arr, mid+1, high, x);
            }
        } else if(arr[mid]>x){
                 return recursiveWay(arr, low, mid-1, x);
        } else{
            return recursiveWay(arr, mid+1, high, x);
        }
    }

    public static int itrativeWay(int arr[] ,int x){
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
    
}
