package sorting;

public class MergeTwoSortedArrar {
    public static void main(String[] args) {
        int a[]={10,20,35};
        int b[]={5,50,50};
        mergeSort(a, b);
    }
    public static void mergeSort(int a[],int b[]){
        int m=a.length;
        int n=b.length;
int i=0;int j=0;
   while(i<m && j<n){
    if(a[i]<=b[j]){
        System.out.print(a[i]+" ");
        i++;
    } else{
        System.out.print(b[j]+" ");
        j++;
    }
   }

   while(i<m){
    System.out.print(a[i]+" ");
    i++;
   } 
   while(j<n){
    System.out.print(b[j]+" ");
    j++;
   }

    }
    
}
