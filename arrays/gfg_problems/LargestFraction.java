package arrays.gfg_problems;

public class LargestFraction {
    public static void main(String[] args) {
     int ans[]=   largestFraction(1, 8);
     for (int i : ans) {
        System.out.print(i+" ");
        
   
     }
    }
    public static int[]  largestFraction(int n, int d)
    {
        // code here
        int num=0;
        int den=1;
        
        for(int q=10000;q>=2;q--){
            int p=(n*q-1)/d;
            if(p* den >=num*q){
                den=q;
                num=p;
            }
        }
          int tot = gcdOfNumber(num,den);
       int [] ans = new int[2];
       ans[0] = num/tot;
       ans[1] = den/tot;
       return ans;
        
    }
    static int gcdOfNumber(int a,int b){
        if(b==0){
            return a;
            
        }
        return gcdOfNumber(b,a%b);
    }
    
}
