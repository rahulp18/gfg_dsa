package bitMagic;

public class CountSetBit {
    public static void main(String[] args) {
        System.out.println(naiveSolution(7));
        System.out.println(BrainKerningams(7));
    }
    // Naive Solution
    public static int naiveSolution(int n){
        int res=0;
        while(n>0){
            res=res+(n&1);
            n=n>>1;
        }
        return res;
    }
    // BRIAN Kerningam's
    public static int BrainKerningams(int n){
        int res=0;
        while(n>0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
