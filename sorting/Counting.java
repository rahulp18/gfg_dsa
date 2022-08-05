package sorting;
public class Counting {
 
    public static void main(String[] args) {
        System.out.println(countSort("geeksforgeeks"));
    }
    public static String countSort(String str){
  String res="";
   
   char alphabet[]="abcdefghijklmnopqrstuvwxyz".toCharArray();;
      
   int count[]=new int[26];
   
      for(int i=0;i<str.length();i++){
        count[str.charAt(i)-'a']+=1;

      }
       for(int i=0;i<count.length;i++){
           for(int j=1;j<=count[i];j++){
            res+=alphabet[i];
           }
       }

  return res;
    }
}
