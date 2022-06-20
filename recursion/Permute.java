package recursion;

public class Permute {
    public static void main(String[] args) {
  
 
 permute("ABC", 0);
       
    }
    
    public static void permute(String s,int i){
        if(i==s.length()-1){
            System.out.print(s+" ");
            return;
        }
        for(int j=i;j<s.length();j++){
           s=swap(s,i,j);
           permute(s, i+1);
           s=swap(s,i,j);
        }
    }
    public static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
    
}
