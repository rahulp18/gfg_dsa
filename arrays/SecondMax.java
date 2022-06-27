package arrays;

public class SecondMax extends FindMax {
    public static void main(String[] args) {
        int arr[]={8,88,9,45,69};
        System.out.println(findSecondMax(arr, arr.length));
        System.out.println(secondMaximum(arr, arr.length));
    }
// TIME COMPLEXCITY bigO(N);
    public static int findSecondMax(int arr[],int n){
        int res=-1;
      int largest=findMax(arr, n);
      for(int i=0;i<n;i++){
        if(arr[i]!=arr[largest]){
              if(res==-1){
                res=i;
              }
              else if(arr[i]>arr[res]){
                res=i;
              }
        }
      }
      return res;
    }
// SECOND METHOD 

public static int secondMaximum(int arr[],int n){
    int res=-1;
     int largest=0;

     for(int i=0;i<n;i++){
        if(arr[i]>arr[largest]){
            res=largest;
            largest=i;

     }
     else if(arr[i]!=arr[largest]){
        if(res==-1|| arr[i]>arr[res])
        res=i;
     }

}
return res;
    
    
}

}