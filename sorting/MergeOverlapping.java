package sorting;

import java.util.Arrays;

class Interval implements Comparable<Interval>{
    int start;
    int end;
    Interval(int start,int end){
        this.start=start;
        this.end=end;
    }

    public int compareTo(Interval a){
               return this.start-a.start;
    }
public class MergeOverlapping {
    public static void main(String[] args) {
        Interval [] arr ={new Interval(5, 10),new Interval(3, 15),new Interval(18, 30),new Interval(2, 7)};
        int n=arr.length;
        mergeInerval(arr, n);
        
    }
    
}
public static void  mergeInerval(Interval arr[],int n){
       Arrays.sort(arr);
       int res=0;

       for(int i=1;i<n;i++){
        if(arr[res].end>=arr[i].start){
            arr[res].end=Math.max(arr[res].end,arr[i].end);
            arr[res].start=Math.min(arr[res].start,arr[i].start);
        } else{
            res++;
            arr[res]=arr[i];
        }
       }
       for (int i=0;i<=res;i++) {
        System.out.print("["+arr[i].start+","+arr[i].end+"]");
       }

}

}
