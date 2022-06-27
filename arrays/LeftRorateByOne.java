package arrays;

public class LeftRorateByOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        lftRtaOne(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void lftRtaOne(int arr[]){
        int n=arr.length;
        int temp=arr[0];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
}
