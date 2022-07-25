package sorting;

public class InversionCount {
    public static void main(String[] args) {
        int []arr={2,4,1,3,5};
        // System.out.println(countInversions(arr,arr.length));
        System.out.println(countInv(arr, 0, arr.length-1));
        // for (int i : arr) {
        //     System.out.print(i+" ");
            
        // }
    }
    public static int countInv(int arr[],int l,int r){
        int res=0;
        if(l<r){
            int m=l+(r-l)/2;
            res+=countInv(arr, l, m);
            res+=countInv(arr, m+1, r);
            res+=countAndMerge(arr,l,m,r);
        }
        return res;
    }

    public static int countAndMerge(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;

        int left[]=new int[n1];
        int right[]=new int[n2];
       
       
         for(int i=0;i<n1;i++){left[i]=arr[i+l];}
         for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        for (int i : right) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : left) {
            System.out.print(i+" ");
        }
         int i=0,j=0,res=0,k=l;

         while(i<n1 && j<n2){
            if(left[i]<=right[j]){
         arr[k]=left[i]; i++;
            }
            else {
                res=res+(n1-i);
                j++;
            }
            k++;
         }

         while(i<n1){
            arr[k]=left[i];i++;k++;
         } 
         while(j<n2){
            arr[k]=right[j];j++;k++;
         }
        return res;
    }
    
    static int countInversions(int arr[], int n){
    
        int res=0;
        for(int i=0;i<(n-1);i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
               
                    res++;
            }
        }
        return res;
    }
   


}
