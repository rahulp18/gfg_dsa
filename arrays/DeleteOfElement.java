package arrays;

 
public class DeleteOfElement {
    public static void main(String[] args) {
       
        int arr[]={2,12,45,82,8};
     
          
    deleteElement(arr, 78);
 
    }
    public static void deleteElement(int arr[],int x){
        int indx=-1;
          for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                
          indx=i;
          break;
            }
          
          }
          if(indx==-1){
            System.out.println("Index out of bound (Element is not present)");
            return;
          }
          for(int j=indx;j<arr.length-1;j++){

              arr[j]=arr[j+1];
          }
      arr[arr.length-1]=0;
          for (int i : arr) {
            System.out.print(i+" ");
            
          }

    }
    
}
