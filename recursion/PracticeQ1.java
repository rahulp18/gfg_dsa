package recursion;

public class PracticeQ1{
    public static void main(String[] args) {
      fun(3);
    }

    public static void fun(int n){
      if(n==0){
        // BASE CASE
        return;
      }
      System.out.println(n);
      fun(n-1);
      System.out.println(n);
    }

 
}