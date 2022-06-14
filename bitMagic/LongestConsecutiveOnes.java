package bitMagic;

public class LongestConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(consecutiveCount(222));
    }
    public static int consecutiveCount(int n){
        int max=Integer.MIN_VALUE;
        int count=0;

   while(n>0){
       if((n&1)==1){
           count++;
           max=count>max?count:max;
       }else{
           count=0;
       }
       n=n>>1;
   }

        return max;
    }
}
