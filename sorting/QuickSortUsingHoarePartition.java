package sorting;

public class QuickSortUsingHoarePartition {
    public static void main(String[] args) {
        int arr[]={5,4,8,21,7,6,1,0};
        qSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

public static void qSort(int arr[],int l,int h){
    if(l<h){
    int p=partition(arr, l, h);
    qSort(arr, l, p);
    qSort(arr, p+1, h);
    }
}

    public static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1,j=h+1;

        while(true){
            do {
                i++;
            } while (arr[i]<pivot);
            do{
                j--;
            
            }while(arr[j]>pivot);
           if(i>=j){
           return j;
            }
swap(arr,i,j);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
}
