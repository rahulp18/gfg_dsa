package sorting;

public class HoareSPartition {
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};
        System.out.println(hPartition(arr, 0, arr.length-1));
        for (int i : arr) {
          System.out.print(i+" ");
          
        }
    }
    public static int hPartition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do{
                i++;
            } while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            swap(arr,i,j);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
}
