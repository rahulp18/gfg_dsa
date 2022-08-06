package sorting;

import java.util.Arrays;

public class MergeWithOutSpace{
    public static void main(String[] args) {
        long arr1[]={1,3,5,7};
        long arr2[]={0,2,6,8,9};
  merge(arr1, arr2, arr1.length,arr2.length);
    for (long l : arr1) {
        System.out.print(l+" ");
    }
    
    for (long l : arr2) {
        System.out.print(l+" ");
    }
    }
     //Function to merge the arrays.
     public static void merge(long arr1[], long arr2[], int n, int m) 
     {
         // code here 
         
         int i=0,j=0,k=n-1;
         
         while(i<n && j<m && k>i){
    
            if(arr1[i]>=arr2[j]){
              
                 long temp=arr1[k];
                 arr1[k]=arr2[j];
                 arr2[j]=temp;
                 System.out.println(arr1[i]);
                 j++;
                 k--;
             } else{
                 i++;
             }
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
     }
}