package mathematics;
import java.util.*;
public class Factotial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number for FACTORIAL");
        int num=sc.nextInt();
        System.out.println(findFactorial(num));
        System.out.println(fact(num));
        sc.close();
    }

    static int findFactorial(int n){
        int fact=1;
while(n>0){
    fact=fact*n;
    n--;
}

        return fact;
    }

    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
