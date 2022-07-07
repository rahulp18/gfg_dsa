package arrays.gfg_problems;

public class BettingGame {
    public static void main(String[] args) {
        // System.out.println(betBalance("WLWLLLWWLW"));
        betBalance("WWLWLLL");
    }
    static void betBalance(String result)
    {
        // code here
        
        int sum=4;
        int bet=1;
        
        for(int i=0;i<result.length();i++){
            if(sum<0 || sum<bet){
                sum=-1;
                 System.out.println(sum);
                break;
            }
            if(result.charAt(i)=='W'){
                sum=sum+bet;
                bet=1;
                System.out.println("WIN sum "+sum+" bet "+bet);
            } else{
                sum=sum-bet;
                bet=2*bet;
                System.out.println("LOSS sum "+sum+" bet "+bet);
            }
            
        }
       
    }
    
}
