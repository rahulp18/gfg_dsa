package bitMagic;

public class FindFirstBit {
    public static void main(String[] args) {
        System.out.println(findBit(18));
    }
    // TIME COMPLEXCITY IS LOG N

    public static int findBit(int n){
       if(n==0){
           return 0;
       }

       return (int)(Math.log(n&-n)/Math.log(2.0))+1;
    }
}
