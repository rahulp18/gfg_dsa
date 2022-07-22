package sorting;

public class PrintUnion {
    public static void main(String[] args) {
        int a[]={3,5,8};
        int b[]={2,8,9,10,15};
        printUnion(a, b);
    }
    public static void printUnion(int a[],int b[]){
        int m=a.length;
        int n=b.length;

        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            } 
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            } 
            if(a[i]<b[j]){
        System.out.print(a[i]+" ");
        i++;
            } 
            else if(a[i]>b[j]) {
                System.out.print(b[j]+" ");
                j++;
            } else if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<n){
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            System.out.print(b[j]+" ");
            j++;
        }
    }
    
}
