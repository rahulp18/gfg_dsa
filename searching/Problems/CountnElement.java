package searching.Problems;

public class CountnElement {
    public static void main(String[] args) {
        int arr[]={2,3,3,2};
        System.out.println(countOccurence(arr, arr.length, 3));
    }
    public static int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int res[]=new int[1000000];
        
        for(int i=0;i<n;i++){
            res[arr[i]]+=1;
        }
        int count=0;
        for(int i=0;i<1000000;i++){
            if(res[i]>(n/k)){
                count++;
            }
        }
        return count;
    }
    
}
