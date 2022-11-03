package string;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(findNonRepeating(str));
    }

    // NAIVE SOLUTIONS TIME COMPLEXCITY BIG O N 2
    public static int findNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return i;
            }
        }

        return -1;
    }
}
