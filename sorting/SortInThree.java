package sorting;

public class SortInThree {
    public static void main(String[] args) {
        int arr[]={0,1,2,1,1,2};
        naiveSolution(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }

    public static void naiveSolution(int arr[]){
        int n=arr.length;
        int[] temp=new int [n];

      int i=0;

      for(int j=0;j<n;j++){
        if(arr[j]==0){
            temp[i]=arr[j];
            i++;
        }
      }
      for(int j=0;j<n;j++){
        if(arr[j]==1){
            temp[i]=arr[j];
            i++;
        }
      }
      for(int j=0;j<n;j++){
        if(arr[j]==2){
            temp[i]=arr[j];
            i++;
        }
      }
      for(int j=0;j<n;j++){
       arr[j]=temp[j];
      }
    }
    
}
