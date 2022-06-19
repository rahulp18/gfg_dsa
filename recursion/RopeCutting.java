package recursion;

public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(maxPeices(9, 5, 2, 5));
    }
    public static int maxPeices(int n ,int a, int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;

        int res1=Math.max(maxPeices(n-a,a,b,c),maxPeices(n-b, a, b, c));
        int res=Math.max(res1,maxPeices(n-c, a, b, c));
        if(res==-1) return -1;

        return res+1;
    }
}
