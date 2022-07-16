package arrays;

public class CountOnes {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,0,1,1,0};
        System.out.println(counts(arr));    
    }
    public static int counts(int arr[]){
        int  n=arr.length;
        int count=0;
        int max_count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count=0;
            }
            else{
                   
                   count++;
                   
                   max_count=Math.max(count, max_count);
                }
             
        }
        return max_count;
    }
    
}
