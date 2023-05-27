package class23Hw;
    /*
    Count the Number of Words in a String:
    Write a function to count the number of words in a given string.
    Words are separated by spaces or punctuation.
    For example, the input "Hello, world!" should return 2.
     */
public class WordCounter03 {
    public static int countWords(String input) {
        return input.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println(wordCount);
    }
}
