package recursion;

public class GenSubSet {
    public static void main(String[] args) {
        subset("ABC", "", 0);
    }
    public static void subset(String s,String curr,int i){
             if(i==s.length()){
                System.out.print(curr+" ");
                return;
             }
             subset(s, curr, i+1);
             subset(s, curr+s.charAt(i), i+1);
    }
}
