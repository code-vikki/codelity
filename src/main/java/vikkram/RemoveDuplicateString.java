package vikkram;

import java.util.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        String stringWithDupRemoved = removeduplicate(null);
        char mostRepetiveChar = mostRepetiveChar("green");

        boolean isAnagram = isAnagram("listen","silent");
        System.out.println(isAnagram);
        System.out.println(mostRepetiveChar);
        System.out.println(stringWithDupRemoved);
    }

    private static boolean isAnagram(String first, String second) {
        final int englishAlphabet=26;
        int[] frequencies = new int[englishAlphabet];
        int[] frequencies2 = new int[englishAlphabet];

        for(int i =0;i<first.length();i++){
            int adjusted = first.charAt(i) -'a';
            frequencies[adjusted]++;
        }

        for(int i =0;i<second.length();i++){
            int adjusted = second.charAt(i) -'a';
            frequencies2[adjusted]++;
        }


        return Arrays.equals(frequencies,frequencies2);
    }

    private static char mostRepetiveChar(String vikkram) {
        Map<Character, Integer> mapOfString = new HashMap<>();

        for (char character : vikkram.toCharArray()) {
            if (mapOfString.containsKey(character)) {
                Integer countOfChar = mapOfString.get(character);
                mapOfString.put(character, ++countOfChar);
            } else {
                mapOfString.put(character, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        char character = ' ';
        for(Map.Entry<Character, Integer> entry:mapOfString.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                character = entry.getKey();
            } ;
        }
       return character;
    }

    private static String removeduplicate(String vikkram) {
        if (vikkram == null) return "";

        List<String> characterList = new ArrayList<>();
        Set<Character> seenBefore = new HashSet<>();

        for (char character : vikkram.toCharArray()) {
            if (!characterList.contains(String.valueOf(character))) {
                characterList.add(String.valueOf(character));
            }
//            if (seenBefore.add(character)) {
//                characterList.add(String.valueOf(character));
//            }
        }


        return String.join("", characterList);
    }
}
