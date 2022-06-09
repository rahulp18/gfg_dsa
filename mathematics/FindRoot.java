package mathematics;

import java.util.ArrayList;

public class FindRoot {
    public static void main(String[] args) {
        System.out.println(quadraticRoots(2, 1, 8));
     
    }
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots = new ArrayList<>();
        
        double discriminant = b*b - 4*a*c;
        if(discriminant < 0) 
            roots.add(-1);
        else{
        double dR = Math.sqrt(discriminant);
        double root1 = (-b + dR)/(2*a);
        double root2 = (-b - dR)/(2*a);
        roots.add((int)Math.floor(Math.max(root1, root2)));
        roots.add((int)Math.floor(Math.min(root1, root2)));
        }
        
        return roots;
    }
}
