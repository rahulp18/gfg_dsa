package arrays;

public class Leaders {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,6,5,2};
        naiveSlns(arr, arr.length);
        System.out.println();
        System.out.println("Better solution with order Theta(n)");
        leaders(arr, arr.length);


        
    }

    public static void naiveSlns(int arr[],int n){
        for(int i =0;i<n;i++){
          boolean flag=false;

          for(int j=i+1;j<n;j++){
            if(arr[i]<=arr[j]){
                flag=true;
                break;
            }
          }
          if(flag==false) System.out.print(arr[i]+" ");
        }
    }
    public static void leaders(int arr[],int n){
        int curr_ldr=arr[n-1];
        System.out.print(curr_ldr+" ");
        for (int i = n-2; i >=0; i--) {
             if(curr_ldr<arr[i]){
                curr_ldr=arr[i];
                System.out.print(curr_ldr+" ");
             }
        }
    }
    
}
