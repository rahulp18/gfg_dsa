package arrays.gfg_problems;

public class CountFequency {
    public static void main(String[] args) {
        int arr[]={3,3,3,3};

    frequencyCount(arr, 4, 3);

    for (int i : arr) {
        System.out.print(i+" ");
        
    }
    }
    public static void frequencyCount(int arr[], int n, int p)
    {
        // code here
         for (int j = 0; j < n; j++)
            arr[j] = arr[j] - 1;
       for(int i=0;i<n;i++){
            if(arr[i] % p < n){
                int num = arr[i] % p;
                arr[num] = arr[num] + p;
            }
           
        }   
          for(int i=0;i<n;i++){
            int count = arr[i] / p;
            arr[i] = count;
        }
     
    }
    
}
