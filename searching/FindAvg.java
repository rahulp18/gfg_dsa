package searching;

import java.util.Arrays;

public class FindAvg{
    public static void main(String[] args) {
        int a1[]={10,20,30,35};
        int a2[]={5,15,50};
        System.out.println(findAvg(a1, a2));
    }
    
    public static double findAvg(int a1[],int a2[]){
        int n1=a1.length;
        int n2=a2.length;

        int temp[]=new int [n1+n2];

        for(int i=0;i<n1;i++){
            temp[i]=a1[i];
        }
        for(int i=0;i<n2;i++){
              temp[n1+i]=a2[i];
        }
        Arrays.sort(temp);

        int mid=(n1+n2)/2;

        if((n1+n2)%2==0){
            return (double) (temp[mid]+temp[mid-1])/2;
        } else{
            return (double)temp[mid];
        }
    }
}