package mathematics;

public class TraillingFactor {
        public static void main(String[] args) {
            System.out.println(countTraillingZeros(5));
            System.out.println(countZeros(5));
        }
// TIME COMPLXCITY OF THIS ALGOROTHM IS (LOG(N))
        public static int countTraillingZeros(int n){
            int res=0;
     
            for(int i=5;i<=n;i=i*5){
                 res=res+n/i;
            }

            return res;

        }
        // time complexcity is theta(n)

        public static int countZeros(int n){
            // FIRST FIND FACTORIAL
int fact=1;
for(int i=2;i<=n;i++){
    fact=fact*i;
}
int res=0;

while(fact%10==0){
    res++;
    fact=fact/10;

}
return res;
        }
}
