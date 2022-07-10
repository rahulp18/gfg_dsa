package searching;

public class SortRotated {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,8,9};
        System.out.println(Search(arr, arr.length, 40));

    }
    public static int Search(int arr[],int n,int x){
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==x) return mid;
            if(arr[low]<arr[mid]){
                if(x>=arr[low] && x<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]>x && x <=arr[high]){
                    low=mid+1;
                } else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    
}
