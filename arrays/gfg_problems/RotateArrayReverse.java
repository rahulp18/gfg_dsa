package arrays.gfg_problems;

public class RotateArrayReverse {
    public static void main(String[] args) {
         int arr[]={2,4,6,8,10,12,14,16,18,20};
         rotateArr(arr, 3, arr.length);
         for (int i : arr) {
            System.out.print(i+" ");
            
         }

    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d=d%n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
    }
    public static void  reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}
