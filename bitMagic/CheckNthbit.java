package bitMagic;

public class CheckNthbit {
    public static void main(String[] args) {
        checkBit(5, 3);
        method2(5, 3);
    }
    // Method 1 using leftbit oprstion
    public static void checkBit(int n,int k){
        if((n & (1 << (k - 1))) != 0){
   System.out.println("YES SET");
        } else{
            System.out.println("NOT VALID SET");
        }
    }
    // ussing Right shift
    public static void method2(int  n,int k){
 if((1& (n >> (k-1) ))==1){
     System.out.println("Set");
 } else{
     System.out.println("Not Set");
 }
    }
}
