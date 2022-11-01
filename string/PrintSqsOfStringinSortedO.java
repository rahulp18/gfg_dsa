package string;

import java.util.*;

public class PrintSqsOfStringinSortedO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to print Sequence of Character");
        String str = sc.nextLine();

        PrintSequence(str);
        sc.close();
    }

    public static void PrintSequence(String str) {
        int arr[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            arr[str.charAt(i) - 'a']++;
        }
        // for Printing
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.println((char) (i + 'a') + " " + arr[i]);
        }
    }
}