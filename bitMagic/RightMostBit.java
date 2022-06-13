package bitMagic;

public class RightMostBit {
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(4, 12));
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
            if(m==n){
                return -1;
            }
        // Your code here  
        int x=m^n;
        
        return (int)(Math.log(x&-x)/Math.log(2.0))+1;
            
    }
}
