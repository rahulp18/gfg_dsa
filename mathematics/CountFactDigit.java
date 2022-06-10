package mathematics;

import java.math.BigInteger;

public class CountFactDigit {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(42));
    }
    public static int digitsInFactorial(int n){
        // code here
       BigInteger f=new BigInteger("1");
 
       for(int i=2;i<=n;i++){
           
           f=f.multiply(BigInteger.valueOf(i));
       }
       
         

       
     
    
        return  f.toString().length();
    }
}
