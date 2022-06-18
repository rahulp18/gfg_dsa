package recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println( isPalin("abba", 0, 3));
       
    }
    
    public static boolean isPalin(String str,int start,int end){
        if(start>=end){
            return true;

        }
        return (str.charAt(start)==str.charAt(end)) && (isPalin(str, start+1, end-1));
    }
}
