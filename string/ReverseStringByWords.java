package string;

import java.util.Scanner;

public class ReverseStringByWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to reverse");
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        reversWord(str, s.length());
        System.out.println(new String(str));
        sc.close();
    }

    public static void reversWord(char[] str, int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }

    public static void reverse(char[] str, int start, int end) {
        while (start <= end) {
            // swap
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

}
