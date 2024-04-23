package vikkram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

        String word = "GOD";
        String secondWord="dog";

        boolean b = checkIfAnagram(word, secondWord);

        reverseString(word);
    }

    private static void reverseString(String word) {
    }

    private static boolean checkIfAnagram(String word, String secondWord) {
//        String[] split = word.split("");
//        String[] split1 = secondWord.split("");
//        Set sourceSet = new HashSet(Arrays.asList(split));
//        Set sourceSet2 = new HashSet(Arrays.asList(split1));
//        return sourceSet2.equals(sourceSet2);

        char[] first = word.toCharArray();
        char[] second = secondWord.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
}
