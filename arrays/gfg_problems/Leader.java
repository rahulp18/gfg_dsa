package arrays.gfg_problems;

import java.util.ArrayList;
 
import java.util.Collections;

public class Leader {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> Leaders=new ArrayList<Integer>();
        
        int curnt_leader=arr[n-1];
        Leaders.add(curnt_leader);
        for(int i=n-2;i>=0;i--){
            if(curnt_leader<=arr[i]){
                curnt_leader=arr[i];
                Leaders.add(curnt_leader);
            }
        }
        Collections.reverse(Leaders);   
        return Leaders;
    }
    
}
