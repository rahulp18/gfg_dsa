package arrays;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[]={10,10,10,3};
          cntFrq(arr);
    }
    

    public static void cntFrq(int arr[])
    {
     int freq=1,i=1;
   int n=arr.length;
     while(i<n){
        while(i<n && arr[i]==arr[i-1]){
            freq++;
            i++;
        }
        System.out.println(arr[i-1]+" "+freq);
        i++;
        freq=1;

     }
     if(n==1 || arr[n-1]!=arr[n-2]){
        System.out.println(arr[n-1]+" "+1);
     }
}
}
