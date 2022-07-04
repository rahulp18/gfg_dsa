package arrays.gfg_problems;

public class NoExtraSpace {
    public static void main(String[] args) {
        
    }
    static void arrange(long arr[], int n)
    {
        // your code here
        
           
        for(int i=0;i<n;i++){
         arr[i] += ((int)arr[(int)arr[i]] % n) * n;
        }
         for(int i=0;i<n;i++){
         arr[i] /= n;
        }
    }
    
}
