package arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int arr[]={10,5,8,7,30};
       int rev[]=reverse(arr, arr.length);
       
       for (int i : rev) {
             System.out.print(i+" ");
       }
    }
    public static int[] reverse(int arr[],int n){

      int high=n-1; int low=0;
        while(low<high){
           
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }



        return arr;
    }
    
}
