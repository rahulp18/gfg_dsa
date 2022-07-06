package arrays.gfg_problems;

import java.util.ArrayList;

public class MaxProfit {
    public static void main(String[] args) {
        int arr[]={100,180,260,310,40,535,695};
        System.out.println(stockBuySell(arr, arr.length));
    }
   static ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > array_list = new ArrayList<ArrayList<Integer> >();
        
        int j=0;
        for(int i=1;i<n;i++){
            
            if(arr[i-1]<arr[i]){
                array_list.add(new ArrayList<Integer>());
                array_list.get(j).add(0, arr[i-1]);
                array_list.get(j).add(1, arr[i]);
                j++;
            }
        }

        return array_list;
    }
    
}
