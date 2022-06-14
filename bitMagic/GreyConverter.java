package bitMagic;

public class GreyConverter {
    public static void main(String[] args) {
        System.out.println(greyConverter(5));
    }
    public static int greyConverter(int n) {
        
        // Your code here
        if(n==0) return 0;
        
        return (n^(n>>1));
        
    }
}
