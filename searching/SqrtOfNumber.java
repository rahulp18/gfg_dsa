package searching;

public class SqrtOfNumber {
    public static void main(String[] args) {
        System.out.println(findSqrt(5));
    }
    public static long findSqrt(long num){
        long low=0;
        long high=num;
long ans=-1;
        while(low<=high){
            long mid=(low+high)/2;
            long sqr=mid*mid;
            if(sqr==num) return mid;
            else if(sqr<num){
                low=mid+1;
                ans=mid;
            } else{
                high=mid-1;
            }
        }
        return ans;
    }
    
}
