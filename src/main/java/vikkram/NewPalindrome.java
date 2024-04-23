package vikkram;

import java.util.Locale;

public class NewPalindrome {

    public static void main(String[] args) {
        Boolean isPalindrome = isPalindrome("Madam");
        System.out.println(isPalindrome);
    }

    private static Boolean isPalindrome(String someString) {
        char[] charArray = someString.toLowerCase(Locale.ROOT).toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left<right){
            if(charArray[left++]!=charArray[right--]) {
                return false;
            }
        }
        return true;
    }
}
