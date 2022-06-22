package recursion;

import java.util.ArrayList;

public class PowerOfSet{
    public static void main(String[] args) {
        System.out.println(powerSet("a"));
    }
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> res=new ArrayList<String>();
          
           
        return findSol(res, s, 0,"");
    }
    
    public static ArrayList<String> findSol(ArrayList<String> arr,String s,int i,String curr){
         if(s.length()==i){
             arr.add(curr);
          return arr;
         }
         findSol(arr, s, i+1,  curr);
         findSol(arr, s, i+1, curr+s.charAt(i));
         return  arr;
    }
}