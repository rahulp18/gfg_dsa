package arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={10,20,20,30,30,30,40,40};
        int size=removeElement(arr, arr.length);
        System.out.println(size);
        
    }

    public static int removeElement(int arr[],int n){
       int res=1;
       for(int i=1;i<n;i++){
        if(arr[i]!=arr[res-1]){
            arr[res]=arr[i];
            res++;
        }
       }
       return res;
    }


    
}
