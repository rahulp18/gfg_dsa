package arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={1,000001,0,0,0,0,0,0,0,0,1,2,2,1,2,21,21,0,0,1,0,1,0,1,0,1,01,000,1,0,1,01,0};
        
    // moveZero(arr, arr.length);
    efficentWay(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static  void moveZero(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                   if(arr[j]!=0){
                  swap(arr, i, j);
                   }
                }
            }
             
        }
       
    }

    public static void efficentWay(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]!=0)
             {
                swap(arr,i,count);
                count++;
             }
        }
    }

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
