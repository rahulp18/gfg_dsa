package recursion;
public class Power{
    public static void main(String[] args) {
        int n=631;
        int rev=Reverse(n);
        System.out.println(n+" "+rev);
        System.out.println((long)Math.pow(n, rev));
    }
    static int ans = 0;
 
    static int Reverse(int var)
    { 
        if (var == 0) {
  
            return ans;
        }
 
        if (var > 0) {
 
        
            int temp = var % 10;
  
            ans = ans * 10 + temp;
 
         
            Reverse(var / 10);
        }
 
        
        return ans;
    }
}