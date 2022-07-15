package searching;

import java.util.Arrays;

public class RepeatingElement {
    public static void main(String[] args) {
        int arr[]={0,2,1,3,5,4,6,2};
        System.out.println(superNaiveSoln(arr));
        System.out.println(nLogNSol(arr));
        System.out.println(getRotateEle(arr));
        System.out.println(findRepeating(arr));
    }
    // It is a super naive solution The time complexcity of the solution is O(n^2) space complexcity O(1)
    public static int superNaiveSoln(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // A naive solution with time complexcity is O(nlogn)  Space complexcity is O(1)

    public static int nLogNSol(int arr[]){
        int n=arr.length;

        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    // Efficent Solution which is time complexcity is O(n) and space xomplexcity is O(n)

    public static int getRotateEle(int arr[]){
        int n=arr.length;
        boolean visited[]=new boolean[n-1];
        for(int i=0;i<n;i++){
            if(visited[arr[i]]){
              return arr[i];
            } visited[i]=true;
        }
        return -1;
    }

    // Efficent solution is O (n) and O(1) space

    public static int findRepeating(int arr[]){
         

        int slow=arr[0]+1;
        int fast=arr[0]+1;

        do{
            slow=arr[slow]+1;
            fast=arr[arr[fast]+1]+1;
        } while(slow != fast);
        slow=arr[0]+1;
        while(slow!=fast){
            fast=arr[fast]+1;
            slow=arr[slow]+1;
    }
    return slow-1;
    }
    
}
