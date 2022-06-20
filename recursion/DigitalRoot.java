package recursion;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(929));
    }
    public static int digitalRoot(int n)
    {
        // add your code here
        if(n<10) return n;
        
        return digitalRoot(sumOfDigits(n));
    }
    public static int sumOfDigits(int n){
        if(n<10)return n;
        
        return (n%10)+sumOfDigits(n/10);
    }
    
}
