package arrays;

public class StrongestNeighbour {
    public static void main(String[] args) {
        int arr[]={5,5};
        maximumAdjacent(arr.length, arr);
    }
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
         for(int i=0;i<sizeOfArray-1;i++){
             if(arr[i]>arr[i+1]){
                 System.out.print(arr[i]+" ");
             }
             else{
                   System.out.print(arr[i+1]+" ");
             }
         }
        
    }
    
}
