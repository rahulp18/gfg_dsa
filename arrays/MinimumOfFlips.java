package arrays;

public class MinimumOfFlips {
    public static void main(String[] args) {
        int arr[]={1,1,1};
     miniCount(arr);   
    }
    public static void miniCount(int arr[]){
               int n=arr.length;
               int prev=arr[0];
               int count0=0;
               int count1=0;

               for(int i=1;i<n;i++){
                if(prev!=arr[i]){
                    if(arr[i-1]==0){
                        count0++;
                    }
                    else{  
                        count1++;
                    }
                }
               prev=arr[i];
              
               }
               if(prev==arr[n-1]){
                if(prev==0){
                    count0++;
                } else{
                    count1++;
                }
            }
             if(count0==0 || count1==0) {
                System.out.println("No need to flif ");
                return;
             }
            int flif=-1;
            if(count0<count1){
                flif=0;
            }
            else{
                flif=1;
            }
         
            boolean isPrint=false;;
            for(int i=0;i<n;i++){
                if(arr[i]==flif){
                     
                   if(isPrint==false){
                    System.out.print("from "+i +" to ");
                    isPrint=true;
                   }


                }
                else{
                     if(isPrint){
                        System.out.print(i-1);
                        System.out.println();
                     }
                    isPrint=false;
                  
                }
            }
    }
    
}
