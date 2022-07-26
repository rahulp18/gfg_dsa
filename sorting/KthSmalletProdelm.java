package sorting;

public class KthSmalletProdelm {
    public static void main(String[] args) {
        int arr[] = new int[]{10,4,5,8,11,6,26};
        System.out.println(arr[findEle(arr, arr.length, 5)]);;
    }
    public static int findEle(int arr [],int n,int k){
        int l=0,r=n-1;
        while(l<=r){
            int p=partition(arr,l,r);
            if(p==k-1)
                return p;
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;

    }

    public static int partition(int arr[],int l,int h){
       
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
   swap(arr,i+1,h);
   return i+1;
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
    
}
