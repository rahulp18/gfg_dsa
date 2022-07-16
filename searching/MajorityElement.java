package searching;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {3,1,3,3,3,2,2,1};
        System.out.println(majorityElement(a, a.length));
    }
    static int majorityElement(int a[], int size)
    {
        // your code here
        int maj_index=0;int count=1;
        
        for(int i=1;i<size;i++){
            if(a[maj_index]==a[i]) count++;
            else count --;
            
            if(count==0) {
                count=1;
                maj_index=i;
            }
        }
        
        count=0;
        for(int i=0;i<size;i++){
            if(a[maj_index]==a[i]) count++;
        }
    return count>(size/2) ? a[maj_index] :-1;
    }
}
