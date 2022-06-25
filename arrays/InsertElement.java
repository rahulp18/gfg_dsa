package arrays;

public class InsertElement {
    public static void main(String[] args) {
       int arr[]= new int[6];
       
       for(int i=0;i<4;i++){
 arr[i]=i*2+1;
       }
     insertElement(arr, 5, 87,0);
    }
    public static void insertElement(int arr[],int size,int element,int position){
        if(size==position-1){
            arr[position]=element;
        } else{
            for(int i=size-1;i>position;i--){
               arr[i]=arr[i-1];
  
            }
            arr[position]=element;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
