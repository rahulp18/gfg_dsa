package sorting;

import java.util.ArrayList;

public class MergerThreeAraay {

    public static void main(String[] args) {
        
       int  A[] = {1,2,3 ,4};
int   B[] = {1,2,3,4,5};
int   C[] = {1,2,3,4,5,6};
System.out.println(merge3sorted(A, B, C));
    }

    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here     
        int l=A.length;
        int m=B.length;
        int r=C.length;
        
        ArrayList <Integer> res=new ArrayList<Integer>();
        
        int i=0,j=0,k=0;
        
        while(i<l && j<m && k<r){
           
            if(A[i]<=B[j] && A[i]<=C[k]){
                 res.add(A[i]);
               i++;
            }
              else if(A[i]>=B[j] && C[k]>=B[j]){
               res.add(B[j]);
               j++;
            } else  {
                res.add(C[k]);
               k++; 
            }
    }
    
    
    while(i<l && j<m){
        if(A[i]<=B[j]){
            res.add(A[i]);
            i++;
        }
         else{
               res.add(B[j]);
               j++;
           }
    }
        while(i<l && k<r){
           if(A[i]<=C[k]){
               res.add(A[i]);
               i++;
           }
           else{
              res.add(C[k]);
               k++; 
           }
       }
       while(j<m  && k<r){
           if(C[k]>=B[j]){
               res.add(B[j]);
               j++;
           }
           else{
              res.add(C[k]);
               k++; 
           }
       }
        while(i<l){
            res.add(A[i]);
             i++;
          
       }
       while(j<m){
        res.add(B[j]); 
        j++;
       }
       while(k<r){
          res.add(C[k]);
           k++; 
       }
    
    
    
    
    return res;
    
    }
}
