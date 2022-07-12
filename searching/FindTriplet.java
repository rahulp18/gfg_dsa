package searching;

public class FindTriplet {
    public static void main(String[] args) {
        int arr[]={2,3,5,8,9,10,11};
        System.out.println(isFind(arr, 20));
        
    }

    public static boolean isFind(int arr[],int x){

         for(int  i=0;i<arr.length;i++){
             if(findSum(arr, i+1, arr.length-1, x-arr[i])){
                return true;
             } 
         }
         return false;
    }
    public static boolean findSum(int arr[],int low,int high,int x){
        

        while(low<high){
           int sum=arr[low]+arr[high];
           if(sum<x){
               low++;
           } else if(sum>x){
               high--;
           } else{
               return true;
           }
        }

        return false;

   }
}
