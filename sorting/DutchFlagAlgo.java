package sorting;
public class DutchFlagAlgo {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,0};
        partition(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void partition(int arr[]){
        int n=arr.length;
        int low=0,mid=0;
        int high=n-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            } else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
