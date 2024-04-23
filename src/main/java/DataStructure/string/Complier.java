package DataStructure.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Complier {

    // static hashmap -> use statix ini
    //instance hashmap field -> constructor to initializr
    private static final Map<Character, Character> map = new HashMap<>();

    static {
        map.put("[".charAt(0), "]".charAt(0));
        map.put("{".charAt(0), "}".charAt(0));
        map.put("<".charAt(0), ">".charAt(0));
        map.put("(".charAt(0), ")".charAt(0));
    }

    public boolean checkSyntax(String input) {
        Stack<Character> complier = new Stack();

        for (char charInInput : input.toCharArray()) {
            if (map.containsKey(charInInput)) complier.push(charInInput);

            if (map.containsValue(charInInput)) {
                if (complier.isEmpty()) return false;
                Character topBracket = complier.pop();
                if (!comparableBrackets(topBracket, charInInput)) return false;
            }
        }
        return complier.isEmpty();
    }

    public boolean comparableBrackets(Character fromStack, Character fromString) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(fromString)) {
                return entry.getKey().equals(fromStack);
            }
        }
        return false;
    }
}
