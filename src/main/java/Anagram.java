import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String s = scanner.nextLine();
        s=s.toLowerCase();
        System.out.println("Enter the second word: ");
        String s1 = scanner.nextLine();
        s1=s1.toLowerCase();

        List<Character> firstWord = new ArrayList<>();
        List<Character> secondWord = new ArrayList<>();


        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            firstWord.add(c);
        }
        for(int i =0; i<s1.length();i++){
            char c1 = s1.charAt(i);
            secondWord.add(c1);
        }

        System.out.println(firstWord);
        System.out.println(secondWord);

        if (firstWord.size() == secondWord.size()) {
            for(int i=0;i<firstWord.size();i++){
                if(!firstWord.contains(secondWord.get(i))){
                    System.out.println("There are not anagrams");
                    return;
                }
            }
            System.out.println("There are anagrams");
        } else{
            System.out.println("They are not anagrams");
        }

    }


}





