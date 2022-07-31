package sorting;

public class CycleSort {
    public static void main(String[] args) {
        int arr[]={10,20,50,40,30};
        sort(arr, arr.length);
        for (int i : arr) {
System.out.print(i+" ");
            
        }
    }
    public static void sort(int arr[],int n){
         
        for(int cs=0;cs<n-1;cs++){
            int item=arr[cs];
            int pos=cs;
            for(int i=cs+1;i<n;i++)
                if(arr[i]<item)
                    pos++;
            //swap(item,arr[pos])
            
            int temp=item;
            item=arr[pos];
            arr[pos]=temp;
            while(pos!=cs){
                pos=cs;
                for(int i=cs+1;i<n;i++)
                    if(arr[i]<item)
                        pos++;
                        
                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
        }
    
    }
    public static void swap(int arr[],int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
