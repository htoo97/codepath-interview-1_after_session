/* Reverse the String */
/*
 * Given an input string, reverse the string word by word.
 */

public class Solution {
    public String reverseWords(String a) {
        String[] tokens = a.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i=tokens.length - 1; i>=0; i--) {
            reversed.append(tokens[i]);
            reversed.append(" ");
        }

        return reversed.toString().trim();
    }
}

