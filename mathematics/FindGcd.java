package mathematics;

public class FindGcd {
    public static void main(String[] args) {
        System.out.println(basicMethod(10, 15));
        System.out.println(gcdEuclidean(10, 15));
        System.out.println(gcd(10, 15));
    }

    public static int basicMethod(int a,int b){
        int res=Math.min(a, b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
    // Euclidean Alogorithm
public static int gcdEuclidean(int a,int b){
    while(a!=b){
        if(a>b){
            a=a-b;
        } else{
            b=b-a;
        }

}
return a;
}
// Recursive way of Euclidean algorithm

public static int gcd(int a,int b){
    if(b==0){
        return a;
    } else{
        return gcd(b, a%b);
    }
}

}
