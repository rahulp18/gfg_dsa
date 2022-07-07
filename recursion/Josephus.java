package recursion;

public class Josephus {
    public static void main(String[] args) {
        System.out.println(jose(2, 1));
    }
    public static int jose(int n,int k){
        if(n==1) return 0;

        return (jose(n-1, k)+k)%n;
    }
}
