package bitMagic;

public class MaxAnd {
    public static void main(String[] args) {
        int arr[]={4,8,12,6};
        System.out.println(maxAND(arr,arr.length));
    }
    public static int maxAND (int arr[], int n) {
        
        // Your code here
        // You can add extra function (if required)
  int res = 0;
        int pattern = 0;
        for(int bit=31;bit>=0;bit--){
            int value = (1<<bit);
            if(value < 0){
                value = value * -1;
            }
            pattern = pattern + value ;
            
            int count = 0;
            for(int i=0;i<arr.length;i++){
                if((arr[i] & pattern) == pattern){
                    count++;
                }
            }
            if(count>=2){
                res = res + value;
            }
            else{
                pattern = pattern - value;
            }
        }
        return res;
    }
    
    
}
