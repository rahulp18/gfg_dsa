package sorting;

public class LamutoPartition {
    public static void main(String[] args) {
        int arr[]={3,8,6,12,10,7};
        System.out.println(lamutoPartition(arr, 0, arr.length-1));
        for (int i : arr) {
          System.out.print(i+" ");
          
        }
    }

    public static int lamutoPartition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
   swap(arr,i+1,h);
   return i+1;
    }
    public static void swap(int arr[],int i,int j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
    }
}
