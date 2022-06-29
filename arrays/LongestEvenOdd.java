package arrays;

public class LongestEvenOdd {
    public static void main(String[] args) {
        int arr[]={5,10,20,6,3,8};
        System.out.println(maxEvenOdd(arr));
        System.out.println(efficentWay(arr));
    }

    public static int maxEvenOdd(int arr[]){
        int n=arr.length;
        int res=1;

        for(int i=0;i<n;i++){
            int curr=1;
            for(int j=i+1;j<n;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j-1]%2==0 && arr[j]%2!=0)){
  curr++;
                } else{
                    break;
                }


            }
            res=Math.max(res,curr);
        }
        return res;
    }


    public static int efficentWay(int arr[]){
        int n=arr.length;
        int res=1;
        int curr=1;

        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i-1]%2==0 && arr[i]%2!=0)){
                curr++;
                res=Math.max(curr, res);
            }
            else{
                curr=1;
            }

        }
        return res;
    }

}
