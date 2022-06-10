package mathematics;

public class Gp {
    public static void main(String[] args) {
        System.out.println(termOfGP(10, 13, 4));
    }
    public static double termOfGP(int A,int B,int N)
    {
        //Your code here
        int r=B-A;
        
        return A*Math.pow(r,N);
    }
}
