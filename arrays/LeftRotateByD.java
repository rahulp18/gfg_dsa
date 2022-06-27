package arrays;

public class LeftRotateByD extends LeftRorateByOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // naiveSolution(arr, 3);
        // efficentSolution(arr, 2);
        leftRotate(arr, arr.length, 3);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        
    }
   
    public static void naiveSolution(int arr[],int d){
        for(int i=1;i<=d;i++){
            lftRtaOne(arr);
        }
    }

    public static void efficentSolution(int arr[],int d){
          int temp[]=new int [d];
          int n=arr.length;
          for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
          }
          for(int i=d;i<n;i++){
   arr[i-d]=arr[i];
          }
          for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
          }
    }

    public static void leftRotate(int arr[],int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,n,n-1);
        reverse(arr,0,n-1);

    }
    public static void reverse(int arr[],int low,int high){
        while(low<high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
