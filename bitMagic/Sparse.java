package bitMagic;

public class Sparse {
    public static void main(String[] args) {
        System.out.println(isSparse(2));
    }
    public static boolean isSparse(int n)
    {
        // Your code here
        int r=n>>1;
        return ((n&r)==0);
    }
}

// NOTE
// A NUMBER IS SAID TO BE SPARE IF NO TWO OR MORE consecutive BITS ARE SET 