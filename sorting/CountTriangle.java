package sorting;

import java.util.Arrays;

public class CountTriangle {
    public static void main(String[] args) {
        int arr[]={26,9,27,22};
       

         System.out.println(findNumberOfTriangles(arr, arr.length));

        
    }
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n-2;i++){
            int k=i+2;
            
            for(int j=i+1;j<n;j++){
                
                while(k<n && arr[i]+arr[j]>arr[k]){
                    k++;
                }
                if(k>j){
                    count+=k-j-1;
                }
            }
        }
        return count;
    }
}
