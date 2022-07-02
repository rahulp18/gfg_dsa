package arrays.gfg_problems;

public class MaxOccuredInt {
    public static void main(String[] args) {
        int L[]={1,5,9,13,21};
        int R[]={15,8,12,20,30};
    System.out.println(maxOccured(L, R, L.length, 1000000));
    }
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int arr[]=new int [ maxx];
        
     int maxi=-1;
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;
            arr[R[i] + 1] -= 1;
            if(R[i]>maxi){
            maxi=R[i];
           }
        }
        
        int sum=arr[0];
        int indx=0;
        for(int i=1;i<maxi+1;i++){
            arr[i]+=arr[i-1];
            if(sum<arr[i]) {
                sum=arr[i];
                indx=i;
            }
        }
        
        return indx;
        
        
        
    }
    
}
