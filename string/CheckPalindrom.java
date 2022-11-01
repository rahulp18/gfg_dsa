package string;

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));
        sc.close();
    }

    public static boolean checkPalin(String str) {
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev += str.charAt(i);
        }

        return str.equals(rev);

    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;
        boolean isBoolean = true;
        while (left <= right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                isBoolean = false;
                break;
            }
        }

        return isBoolean;
    }
}
