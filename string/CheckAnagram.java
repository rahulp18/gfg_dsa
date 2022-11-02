package string;

import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string1");
        String str1 = sc.nextLine();
        System.out.println("Enter string2");
        String str2 = sc.nextLine();

        System.out.println(checkAnagm(str1, str2));
        sc.close();
    }

    public static boolean checkAnagm(String str1, String str2) {
        int str1Array[] = new int[26];
        int str2Array[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            str1Array[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            str2Array[str2.charAt(i) - 'a']++;
        }
        boolean isAnagm = true;
        for (int i = 0; i < str1Array.length; i++) {
            if (str1Array[i] != str2Array[i]) {
                isAnagm = false;
            }
        }
        return isAnagm;
    }

}

// Algo
/*
 * first add the present of charecter how many times
 * then compaire
 */
