package bitMagic;

public class SwapOddEvenBits {
    public static void main(String[] args) {
        System.out.println(swapBits(43));
    }
    public static int swapBits(int n) 
    {
	    // Your code
	    int even_bit=n&(0xAAAAAAAA);
	    int odd_bit=n&(0x55555555);
	    
	    return (even_bit >>1 | odd_bit<<1);
	}
}
