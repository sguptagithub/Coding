package class23Hw;
/*
Check if a String is Palindrome:
Determine whether a given string is a palindrome,
which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */
public class PalindromeChecker02 {
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = isPalindrome(input);
       // System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
        System.out.println(isPalindrome);
    }
}
