package bitMagic;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(naiveSolution(64));
        System.out.println(powerOf2(6));
    }
    public static boolean naiveSolution(int n){
        boolean isFound=false;
        int i=1, res=1;
        while(n>=res){
            if(n==res) {
                isFound=true;
                break;
            }
            res=(int)Math.pow(2, i);
            i++;
        }
        return isFound;
    }
    public static boolean powerOf2(int n){
        if(n==0){
            return false;

        }
        return (n&(n-1))==0;
    }
    public static boolean powerOf2Eff(int n){
      
        return (n!=0) && (n&(n-1))==0;
    }
}
