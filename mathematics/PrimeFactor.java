package mathematics;
public class PrimeFactor {
    public static void main(String[] args) {
       PrintPrimeFactors(12);
       System.out.println();
       PrintPrimeFactors2(12);
       System.out.println();
       PrintPrimeFactors3(12);
    }

    public static void PrintPrimeFactors(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1) return false;
        if(n ==2 || n ==3) return true;
  if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0) return false;
        }
        return true;
    
    }

// Better Way to solve

public static void PrintPrimeFactors2(int n){
  if(n==1)return;
  for(int i=2;i*i<=n;i++){
      while(n%i==0){
          System.out.print(i+" ");
          n=n/i;
      }
  }
  if(n>1){
      System.out.print(n);
  }
}

// More Efficent Wayto find PrimeFactor

public static void PrintPrimeFactors3(int n){
    if(n==1)return;
    while(n%2==0){
        System.out.print(2+" ");
        n=n/2;
    }
    while(n%3==0){
        System.out.print(3+" ");
        n=n/3;
    }
    for(int i=6;i*i<=n;i=i+6){
        while(n%i==0){
            System.out.print(i+" ");
            n=n/i;
        }
        while(n%(i+2)==0){
            System.out.print(i+2+" ");
            n=n/(i+2);
        }
    }
    if(n>1){
        System.out.print(n);
    }
}

}
