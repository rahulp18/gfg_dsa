package recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        print(7);
    }

    public static void print(int n){
    
    if(n==0){
        return ;
    }
    print(n-1);
   System.out.print(n+" ");
 
         
    }
}
