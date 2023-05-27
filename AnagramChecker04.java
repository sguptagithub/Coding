package class23Hw;

import java.util.Arrays;

/*Check if Two Strings are Anagrams: Given two strings,
determine if they are anagrams, meaning they contain the same characters
in a different order. For example, "listen" and "silent" are anagrams.
 */

public class AnagramChecker04 {
    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println(areAnagrams);
    }
}
