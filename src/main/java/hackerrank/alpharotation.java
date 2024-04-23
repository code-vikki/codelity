package hackerrank;

import java.util.Arrays;
import java.util.Locale;

public class alpharotation {

    public static void main(String[] args) {
        System.out.println(caesarCipher("The-car", 87));

    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        if (k < 0) {
            k = k + 26;
        }
        k = k % 26;
        char[] charsInString = s.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (char character : charsInString) {

            if (97 <= character && character <= 122) {
                char newChar = (char) (character + k);
                if (newChar > 122) {
                    newChar = (char) (newChar - 26);
                }
                ;
                stringBuilder.append(newChar);
            } else if (65 <= character && character <= 90) {
                char newChar = (char) (character + k);
                if (newChar > 90) {
                    newChar = (char) (newChar - 26);
                }
                ;
                stringBuilder.append(newChar);
            } else {
                stringBuilder.append(character);
            }
            ;

        }

        return stringBuilder.toString();
    }
}
