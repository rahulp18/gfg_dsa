package arrays;

public class Equilibrium {
    public static void main(String[] args) {
        int arr[]={4,2,-2};
        System.out.println(isEquilibrium(arr));
    }
    public static boolean isEquilibrium(int arr[]){
        int n=arr.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int l_sum=0;

        for(int i=0;i<n;i++){
            if(l_sum==sum-arr[i]){
    return true;
            }
            l_sum=l_sum+arr[i];
            sum=sum-arr[i];
        }
        return false;
    }
    
}
