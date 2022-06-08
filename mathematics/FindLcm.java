package mathematics;

public class FindLcm {
    public static void main(String[] args) {
        System.out.println(lcmBasic(9, 4));
        System.out.println(lcm(9, 4));
    }

    public static int lcmBasic(int a,int b){
        int res=Math.max(a, b);
int i=2;
int temp=res;
        while(true){
            if(res%a==0 && res%b==0){ 
               break;
            } 
                res=temp*i;
                
                i++;
           
        }

 
        return res;
    }
    // Better Way
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

public static int lcm(int a,int b){
    return (a*b)/gcd(a, b);
}
}
