package arrays;

public class FindMax {
    public static void main(String[] args) {
          
        int arr[]={2,120,45,82,8};
     
        System.out.println(findMax(arr, 5));
    }

   public static int findMax(int arr[],int n){
    int max=0;

   for(int i=0;i<n;i++){
     if(arr[max]<arr[i]){
        max=i;
     }
   }

    return max;
    }
    
}
