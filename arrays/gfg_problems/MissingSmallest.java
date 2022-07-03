package arrays.gfg_problems;

public class MissingSmallest {
    public static void main(String[] args) {
        
    }
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int temp[]=new int [100000];
        
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                temp[arr[i]]=1;
            }
        }
        for(int i=1;i<100000;i++){
            if(temp[i]==0){
                return i;
            
            }
        }
        return -1;
    }
    
}
