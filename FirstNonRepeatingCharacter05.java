package class23Hw;

/*
Find the First Non-Repeating Character in a String:
Given a string, find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */

public class FirstNonRepeatingCharacter05 {
    public static char FirstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                return currentChar;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "abracadabra";
        char FirstNonRepeatingChar = FirstNonRepeatingChar(str);

        if (FirstNonRepeatingChar != '\0') {
            System.out.println("The first non-repeating character is: " + FirstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}