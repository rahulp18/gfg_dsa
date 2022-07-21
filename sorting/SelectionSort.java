package sorting;
// Selection sort is not stable
// less memmory uses


public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,8,9,56,7,1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
          for(int j=i+1;j<n;j++){
              if(arr[minIndex]>arr[j]){
                minIndex=j;
              }
          }
          swap(arr,minIndex,i);
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    
}
