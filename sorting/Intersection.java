package sorting;

public class Intersection {
    public static void main(String[] args) {
        // int a[]={3,5,10,10,10,15,15,20};
        // int b[]={5,10,10,15,30};
        int a[]={1,1,3,3,3};
        int b[]={1,1,1,1,3,5,7};

        findIntersection(a, b);
    }

    public static void findIntersection(int a[],int b[]){
             int m=a.length;
             int n=b.length;
             
             int i=0,j=0;

             while(i<m && j<n){
                if(i>0 && a[i]==a[i-1]){
                    i++;
                  continue;
                }
                if(a[i]==b[j]){
                  
                        
                    System.out.print(a[i]+" ");
                    j++;
                    i++;
                  
                    
                } else if(a[i]>b[j]){
                    j++;
                } else{
                    i++;
                }
               
             }

    }
    
}
