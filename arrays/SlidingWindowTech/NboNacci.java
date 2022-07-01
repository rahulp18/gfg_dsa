package arrays.SlidingWindowTech;

public class NboNacci {
    public static void main(String[] args) {
        printSeries(5, 15);
      
    }
// TIME COMPLEXCITY IS BIG O(N);
// AUXILLARY SPACE COMPLEXCITY IS BIG O(M);
    public static void printSeries(int k,int n){
               int numbers[]=new int[n];
               numbers[k-1]=1;
               int sum=0;
               for(int i=0;i<k;i++){
               sum=sum+numbers[i];
               }
               numbers[k]=sum;
               
               for(int i=k;i<n-1;i++){
               sum=sum-numbers[i-k]+numbers[i];
            
               numbers[i+1]=sum;
               }
               for (int i : numbers) {
                System.out.print(i+" ");
               }
    }
    
}

