package string;

import java.util.Scanner;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        System.out.println(find(str));
        sc.close();
    }

    // geeksforgeeks
    public static int findRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    return i;
                }
            }
        }

        return -1;
    }

    // Efficent Solution
    public static int find(String str) {
        boolean visited[] = new boolean[256];
        int res = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)]) {
                res = i;
            } else {
                visited[str.charAt(i)] = true;
            }

        }
        return res;
    }
}
