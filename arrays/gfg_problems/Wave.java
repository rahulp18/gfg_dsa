package arrays.gfg_problems;

public class Wave {
    public static void main(String[] args) {
        int arr[] = {2,4,7,8,9,10};
        convertToWave(arr.length, arr);

        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void convertToWave(int n, int[] arr) {
        // code here
        for(int i=0;i<n-1;i=i+2){
            
                swap(arr,i,i+1);
            
        }
    }
    
    public static void swap(int arr[],int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }
}
