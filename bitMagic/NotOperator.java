package bitMagic;

public class NotOperator {
    public static void main(String[] args) {
        System.out.println(not(4));
    }
    public static int not(int n){
        return ~n;
    }
}
