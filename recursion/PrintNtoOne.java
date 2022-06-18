package recursion;

public class PrintNtoOne {
    public static void main(String[] args) {
           print(7);
    }

    public static void  print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
}
