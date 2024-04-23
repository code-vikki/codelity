package DataStructure.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String text = " green apple";


        char firstNonRepeatedCha = findFirstNonRepeatedCha(text);
        System.out.println(firstNonRepeatedCha);

    }

    private static char findFirstNonRepeatedCha(String text) {
        HashMap<Character, Integer> map = new HashMap();
        String stringwithNoSpace = text.replaceAll("\\s", "");
        char[] chars = stringwithNoSpace.toCharArray();

        for (char a : chars) {
            int count = map.containsKey(a)?map.get(a):0;
            map.put(a, count + 1);
        }
        for(char a:chars){
           if(map.get(a)>1) return a;
        }
        return Character.MIN_VALUE;
    }
}
