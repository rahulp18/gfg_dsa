package mathematics;

public class FindDevisor {
    public static void main(String[] args) {
        PrintDevisor(12);
        System.out.println();
        PrintDevisor2(12);
        System.out.println();
        PrintDevisor3(12);
        System.out.println((int)Math.sqrt(9));
    }
   
    public static void PrintDevisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
public static void PrintDevisor2(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print (i+" ");
            }
            if(i!=n/i){
                System.out.print(n/i+" ");
            }
        }
}

public static void PrintDevisor3(int n){
    int i = 1;
    for(i=1; i*i < n; i++)
    {
        if(n % i == 0)
        {
            System.out.print(i+" ");
        }
    }

    for(; i >= 1; i--)
    {
        if(n % i == 0)
        {
            System.out.print((n / i)+" ");
        
        }
    }

}

}
