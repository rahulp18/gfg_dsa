 package arrays.gfg_problems;

import java.util.ArrayList;

public class PrintPattern{
    public static void main(String[] args) {
        System.out.println(pattern(16));
        
    }

    public static ArrayList<Integer> pattern(int n){
          ArrayList<Integer>res=new ArrayList<>();
             reverseAdd(res, n);
             simpleAdd(res, res.get(res.size()-2), n);
          return res;
    }

    public static void reverseAdd(ArrayList<Integer> res,int n){
        if(n<=0){
            res.add(n);
            return;
        }
        res.add(n);
        reverseAdd(res, n-5);
    }
    public static void simpleAdd(ArrayList<Integer> res,int n,int max){
        if( n==max){
            res.add(n);
            return;
        }
        res.add(n);
        simpleAdd(res, n+5,max);
    }
 }