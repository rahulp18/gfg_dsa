package recursion;

public class PracticeQ3 {
    public static void main(String[] args) {
        System.out.println(fun(16));
    }
    public static int fun(int n){
        if(n==1) return 0;
        return 1+fun(n/2);

    }
}
