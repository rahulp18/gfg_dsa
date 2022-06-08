package mathematics;
import java.util.Scanner;
public class CountDigit {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
        System.out.println("Enter Digit");
    int num=sc.nextInt();
        System.out.println(countDigit(num));

sc.close();
    }

    public static int countDigit(int n){
        int count=0;

    while(n>0){
        count++;
        n=n/10;
    }

        return count;
    }
}
