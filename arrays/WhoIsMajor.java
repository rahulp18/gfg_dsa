package arrays;

public class WhoIsMajor {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,4,4,5};
        System.out.println(majorityWins(arr, arr.length, 4, 5));
    }
    public static int majorityWins(int arr[], int n, int x, int y) {
        // code here
      
         int countX=0;
         int countY=0;
        for(int i=0;i<n;i++){
             if(arr[i]==x){
                 countX++;
             }
             else if(arr[i]==y){
                 countY++;
             }
        }
        if(countX==countY){
            return Math.min(x,y);
        }
        if(countX>countY){
            return x;
        }
        else{
            return y;
        }
    }
    
}
