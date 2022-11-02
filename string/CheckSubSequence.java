package string;

import java.util.Scanner;

public class CheckSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string1");
        String str1 = sc.nextLine();
        System.out.println("Enter string2");
        String str2 = sc.nextLine();

        System.out.println(isSubsequence(str1, str2));
        sc.close();
    }

    public static boolean isSubsequence(String str1, String str2) {
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == str2.length() ? true : false;
    }
}
