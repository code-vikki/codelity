package hackerrank;

public class PalindromeChecker {
    public static void main(String[] args) {
        palindromeIndex("abac");
    }

    public static int palindromeIndex(String s) {
        // Write your code here
        StringBuilder stringBuilder = new StringBuilder(s);
        String reversedString = stringBuilder.reverse().toString();
        if (reversedString.equals(s)) {
            return 1;
        }

        for (int i = 0; i < s.length(); i++) {

            String stringWithOutThisChar = s.substring(0, i) + s.substring(i + 1);
            StringBuilder anotherStringBuilder = new StringBuilder(stringWithOutThisChar);
            String reversed = anotherStringBuilder.reverse().toString();
            if (stringWithOutThisChar.equals(reversed)) {
               return i;
            }
        }

        return -1;
    }

}
