package searching;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,16,45};
        System.out.println(SearchElement(arr, 45));
        System.out.println(efficentWay(arr, 45));
    }
    public static int SearchElement(int arr[],int x){
        int index=0;

        while(arr[index]<=x){
            if(arr[index]==x){
                return index;
            }
            else if(arr[index]>x){
                break;
            }
            index++;
        }
        return -1;
    }

    public static int efficentWay(int arr[],int x){
        if(arr[0]==x) return 0;

        int i=1;
        while(arr[i]<x){
            if(arr[i]==x) return i;
            i=i*2;
            if(i>arr.length-1){
                break;
            }

        }
        return BinarySearch(arr,(i/2)+1,i-1,x);
    }
    public static int BinarySearch(int arr[],int low,int high,int x){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    
}
