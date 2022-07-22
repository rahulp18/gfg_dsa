package sorting;
// TIME COMPLEXCITY OF BUBBLE SORT IS O(n^2) 
// Aux space complexcity is O(1);
public class BubbleSort {
    public static void main(String[] args) {
          int arr[]={0,1,2,3,4,5,6};
          bubbleSort(arr);
          for (int i : arr) {
            System.out.print(i+" ");
            
          }
    }
    public static void bubbleSort(int arr[]){
           boolean isSwap=false;
           int n=arr.length;
           for(int i=0;i<n-1;i++){
              for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    isSwap=true;
                }
              }
              if(isSwap==false){
                break;
              }
           }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
