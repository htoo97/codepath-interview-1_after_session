/* Add Binary Strings */
/*
 * Given two binary strings, return their sum (also a binary string).
 */

public class Solution {
    public String addBinary(String a, String b) {

        // prefix shorter binary string with 0s to equalize length
        if (a.length() < b.length()) {
            StringBuilder str = new StringBuilder();
            for (int i=0; i<(b.length() - a.length()); i++) {
                str.append("0");
            }
            str.append(a);
            a = str.toString();
        }
        else if (b.length() < a.length()) {
            StringBuilder str = new StringBuilder();
            for (int i=0; i<(a.length() - b.length()); i++) {
                str.append("0");
            }
            str.append(b);
            b = str.toString();
        }

        // linearly compare the two strings of equal length
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i=a.length()-1; i>=0; i--) {
            int sum = carry + (int)(a.charAt(i) - '0') + (int)(b.charAt(i) - '0');
            carry = 0;

            if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else if (sum == 3) {
                result.append("1");
                carry = 1;
            }
            else {
                result.append(String.valueOf(sum));
            }
        }

        if (carry == 1) {
            result.append("1");
        }

        return result.reverse().toString();
    }
}

