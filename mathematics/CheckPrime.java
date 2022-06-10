package mathematics;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrimeBasic(49));
        System.out.println(isPrimeEffeicentWay(49));
        System.out.println(moreEfficentWay(49));
    }
    public static boolean isPrimeBasic(int n){
        if(n==1) return false;

        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isPrimeEffeicentWay(int n){
        if(n==1) return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean moreEfficentWay(int n){
        if(n==1) return false;
        if(n ==2 || n ==3) return true;
  if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0) return false;
        }
        return true;
    }
}
