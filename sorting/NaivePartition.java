package sorting;

public class NaivePartition {
    public static void main(String[] args) {
        int arr[]={3,8,6,12,10,7};
      System.out.println(partition(arr, 0, arr.length-1, 5));
      for (int i : arr) {
        System.out.print(i+" ");
        
      }
    }

    public static int partition(int arr[],int l,int h,int p){
        int temp[]=new int [h-l+1];
        int index=0;
        for(int i=l;i<=h;i++){
            if(arr[i]<arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
            if(arr[i]==arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        int res=l+index-1;
        for(int i=l;i<=h;i++){
            if(arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++){
           
                 arr[i]=temp[i-l];
         
        }
        return res;
       
    }
    
}
