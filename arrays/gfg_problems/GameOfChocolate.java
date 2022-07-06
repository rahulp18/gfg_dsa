package arrays.gfg_problems;

public class GameOfChocolate {
    public static void main(String[] args) {
        
    }
    boolean game(int a, int b){
        // Code Here
          if(a>b){
          int temp=a;
          a=b;
          b=a;
      }
      int k=b-a;
        double d= 1 +Math.sqrt(5);
      d/=2;
      d*=k;
      int temp=(int)d;
      if(temp==a){
          return false;
      }
      return true;
    }
    
}
