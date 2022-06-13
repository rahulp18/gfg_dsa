package bitMagic;

public class BitDiference {
    public static void main(String[] args) {
        System.out.println(countBitsFlip(10, 20));
    }
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int n=a^b;
         int count=0;
          
          while(n>0){
              n=(n&(n-1));
              count++;
          }
          return count;
        
    }
}
