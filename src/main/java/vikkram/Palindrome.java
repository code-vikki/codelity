package vikkram;

import java.util.Locale;

public class Palindrome {


    public static boolean checkIfPalindrome(String first) {

        String lowerCasedWord = first.toLowerCase(Locale.ROOT);
        StringBuilder originalText = new StringBuilder(lowerCasedWord);
        StringBuilder reversed = new StringBuilder(lowerCasedWord).reverse();

        return originalText.toString().equals(reversed.toString());

    }

}
