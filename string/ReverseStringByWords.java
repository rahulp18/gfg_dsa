package string;

import java.util.Scanner;

public class ReverseStringByWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to reverse");
        String str = sc.nextLine();

        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String rev = "";
        int end = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ' || i == 0) {
                rev += str.substring(i, end);
                end = i;
                rev += " ";
            }
        }

        return rev;
    }
}
