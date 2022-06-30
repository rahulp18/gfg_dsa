package arrays;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int arr[]={2, 8, 3, 4};

        System.out.println(median(arr, arr.length));
    }
    public static int median(int A[],int N)
    {
      Arrays.sort(A);
        if(N%2 != 0){
           return A[N/2];
       }
       return (A[(N-1)/2] + A[N/2])/ 2;
      
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public static int mean(int A[],int N)
    {
       //Your code here
       int sum=0;
       
       for(int i=0;i<N;i++){
           sum=sum+A[i];
       }
       return sum/N;
    }
}
