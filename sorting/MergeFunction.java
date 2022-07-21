package sorting;

public class MergeFunction {
    public static void main(String[] args) {
        int arr[]={10,15,20,11,30};
        int low=0,mid=2,high=4;
        sort(arr, low, mid, high);
    }
    public static void sort(int arr[],int low,int mid,int high){
        int i=low,j=mid+1;

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else{
                System.out.print(arr[j]+" ");
                j++;
            }
        }
        while(i<=mid){
            System.out.print(arr[i]+" ");
            i++;
        }
        while(j<=high){
            System.out.print(arr[j]+" ");
            j++;
        }
    }
    
}
