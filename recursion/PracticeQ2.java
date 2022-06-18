package recursion;

public class PracticeQ2 {
    public static void main(String[] args) {
        fun(3);
    }
 public static void fun(int n){
    if(n==0){
        return;

    }
    fun(n-1);
    System.out.print(n+" ");
    fun(n-1);
 }
}
