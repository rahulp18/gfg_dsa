package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
          qSort(arr, 0, arr.length-1);
        for (int i : arr) {
          System.out.print(i+" ");
          
        }
    }
    public static int lPartition(int arr[],int l,int h){
    int pivot=arr[h];
int i=l-1;

for(int j=l;j<=h-1;j++)
{
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
    public static void qSort(int arr[],int l,int h){
       if(l<h){
        int p=lPartition(arr, l, h);
        qSort(arr, l, p-1);
        qSort(arr, p+1, h);
       }
    }
}
