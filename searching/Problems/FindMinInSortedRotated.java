package searching.Problems;

public class FindMinInSortedRotated {
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,6,7,8,9,10,1};

        System.out.println(minNumber(arr, 0, arr.length-1));

    }
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        if(high<low) return arr[0];
        if(low==high) return arr[low];
        
        int mid=(low+high)/2;
        
        if(mid<high && arr[mid+1]<arr[mid]) return arr[mid+1];
        if(mid>low  && arr[mid-1]>arr[mid]) return arr[mid];
        
        if(arr[high]>arr[mid]) return minNumber(arr,low,mid-1);
        
        return minNumber(arr,mid+1,high);
    }

}
