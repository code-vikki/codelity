import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;

public class HighestOccurringWord {

    public static void main(String[] args) throws IOException {
        highestOccuringWord("src/main/resources/sentence.txt");

    }

    public static void highestOccuringWord(String a) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(a));
        String s = reader.readLine();
        s=s.toLowerCase();
        String[] s1 = s.split(" ");




        List<String> newListOfString = new ArrayList<>();
        for (String c : s1) {
            for (int i = 0; i < c.length(); i++) {
                if (!(Character.isAlphabetic(c.charAt(i)))) {
                    c = c.replace(c.charAt(i), ' ');
                }
            }
            newListOfString.add(c.trim());
        }

        Map<String, Integer> hashmap = new HashMap<>();

        for (String d : newListOfString) {

            Integer integer = hashmap.get(d);

            if (integer == null) {
                hashmap.put(d, 1);
            } else {
                hashmap.put(d, integer + 1);
            }

        }

        List<Integer> intArrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entries : hashmap.entrySet()) {
            Integer value = entries.getValue();
            intArrayList.add(value);
        }
        Integer max = Collections.max(intArrayList);

        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == max)
                System.out.println("The word " + "\"" + entry.getKey() + "\"" + " has the largest occurrence at " + max + " times");
        }
        System.out.println(hashmap.entrySet());
    }


}
