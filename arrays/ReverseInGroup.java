package arrays;

import java.util.ArrayList;

public class ReverseInGroup {
    public static void main(String[] args) {
         ArrayList <Integer> arr=new ArrayList<Integer>();
         arr.add(1);
         arr.add(5);
         arr.add(58);
         arr.add(23);
        //  arr.add(231);
        reverseInGroups(arr, arr.size(), 3);
       System.out.println(arr);
    }
   //Function to reverse every sub-array group of size k.
   static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
    // code here
       for (int i = 0; i < n; i += k) { 
        
        //If (ith index +k) is less than total number of elements it means
        //k elements exist from current index so we reverse k elements 
        //starting from current index.
        if(i+k < n){ 
            //reverse function called to reverse any part of the array.
            reverse(arr,n,i,i+k-1);
        }
        //Else k elements from current index doesn't exist. 
        //In that case we just reverse the remaining elements.
        else{
            //reverse function called to reverse any part of the array.
            reverse(arr,n,i,n-1);
        }
       
    }
}
   
 static void reverse(ArrayList<Integer> arr, int n,int left, int right)
{
       //reversing the sub-array from left index to right index.
        while (left < right) { 
            //swapping values at index stored at left and right index.
            int temp = arr.get(left); 
            arr.set(left, arr.get(right)); 
            arr.set(right, temp);
            
            //updating values of left and right index.
            left+=1; 
            right-=1;  
        }
}

    
}
