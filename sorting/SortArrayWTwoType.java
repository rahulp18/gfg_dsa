package sorting;

public class SortArrayWTwoType {
    public static void main(String[] args) {
        int arr[]={12,-2,-5,78,78,78,7,9,8,7,-5,-5,74,-8,-8,-6,-8};
        // segPosNeg(arr);
        hoare(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void segPosNeg(int arr[]){
        int i=-1;
        int n=arr.length;
        for(int j=0;j<n;j++){
          if(arr[j]<0){
            i++;
            swap(arr,i,j);
          }
        }
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void hoare(int arr[]){
        int n=arr.length;
        int i=-1,j=n;
        while(true){
            do{
                i++;
            } while(arr[i]<0);
            do{
                j--;
            } while(arr[j]>=0);
            if(i>=j){
                return;
            
            }
            swap(arr, i, j);
        }
    }
    
}
