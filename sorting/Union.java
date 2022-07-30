package sorting;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m)
    {
        // add your code here
             ArrayList<Integer> list=new ArrayList<>();
       
       int i=0;
       int j=0;
       
       while(i<n && j<m){
           if(a[i]==b[j]){
               if(list.size()>0 && list.get(list.size()-1)!=a[i]){
                   list.add(a[i]);
               }else if(list.size()==0){
                   list.add(a[i]);
               }
               i++;j++;
           }
           else if(a[i]<b[j]){
                 if(list.size()>0 && list.get(list.size()-1)!=a[i]){
                   list.add(a[i]);
               }else if(list.size()==0){
                   list.add(a[i]);
               }
               i++;
           }else{
                 if(list.size()>0 && list.get(list.size()-1)!=b[j]){
                   list.add(b[j]);
               }else if(list.size()==0){
                   list.add(b[j]);
               }j++;
           }
       }
       
       while(i<n){
             if(list.get(list.size()-1)!=a[i]){
                   list.add(a[i]);
             }i++;
       }
       
       while(j<m){
             if( list.get(list.size()-1)!=b[j]){
                   list.add(b[j]);
               }j++;
       }
   
   
   return list;
    
       
    }
}
