package string.PatternSearch;

import java.util.Scanner;

public class Naive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String text = sc.nextLine();
        System.out.println("Enter Pattern to searching");
        String pat = sc.nextLine();

        patSearchinng(text, pat);
    }

    static void patSearchinng(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <= (n - m); i++) {
            int j;
            for (j = 0; j < m; j++)
                if (pat.charAt(j) != txt.charAt(i + j))
                    break;

            if (j == m)
                System.out.print(i + " ");
        }
    }

}
