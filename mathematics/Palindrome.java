package mathematics;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter number for check");
        int n=sc.nextInt();
        System.out.println(checkPlin(n));
        sc.close();
    }

     public static boolean checkPlin(int n){
  boolean isPalin=false;
  int temp=n;
  int rev=0;
    
  while(temp>0){
      int rem=temp%10;
      rev=rev*10+rem;
      temp=temp/10;
  }


isPalin=n==rev;
  return isPalin;

     }
}
