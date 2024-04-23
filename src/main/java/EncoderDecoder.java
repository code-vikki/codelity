import java.util.*;

public class EncoderDecoder {
    private char offSet;
    private Integer offSetValueForOriginalText;
    static Scanner scanner = new Scanner(System.in);

    public char getOffSet() {
        return offSet;
    }

    private Map<Character, Integer> refTable = getRefTable();

    public EncoderDecoder(char offSet) {
        this.offSet = offSet;
    }

    public static void main(String[] args) {
        System.out.print("Enter message to encode: ");
        String s = scanner.nextLine().toUpperCase();

        System.out.print("Enter character to offset by: ");
        char offSet = scanner.nextLine().toUpperCase().charAt(0);

        EncoderDecoder encoderDecoder = new EncoderDecoder(offSet);
        String encodedMessage = encoderDecoder.encode(s);

        System.out.println(s+" is encoded to "+encodedMessage);

        String decodedMessage = encoderDecoder.decode(encodedMessage);
        System.out.println(encodedMessage+ " is decoded to " + decodedMessage);
        System.out.println("Offset character is " + encoderDecoder.getOffSet());

    }

    public String decode(String encodedText) {

        char[] chars = encodedText.toCharArray();
        List<Integer> intValofChar = new ArrayList<>();

        for (char c : chars) {
            intValofChar.add(this.refTable.get(c));
        }

        Integer offSetValueFromRefTable = this.offSetValueForOriginalText;


        for (Map.Entry<Character, Integer> entry : refTable.entrySet()) {

            if ((entry.getValue() - offSetValueFromRefTable) >= 0) {
                entry.setValue(entry.getValue() - offSetValueFromRefTable);
            } else {
                entry.setValue(44 - offSetValueFromRefTable + entry.getValue());
            }
        }

        List<Character> charOfList= new ArrayList<>();
        for (Integer integer:intValofChar){
            for (Map.Entry<Character, Integer> entry : refTable.entrySet()) {
                if(integer==entry.getValue()){
                    Character key = entry.getKey();
                    charOfList.add(key);
                }
            }
        }

        int indexOfWhitespace;
        if(intValofChar.contains(null)){
            indexOfWhitespace = intValofChar.indexOf(null);
            charOfList.add(indexOfWhitespace,' ');
        }

        String decodedString=" ";
        for(char a: charOfList){
            decodedString+=a;
        }

        return decodedString.trim();
    }


    public String encode(String s) {

        char[] charArray = s.toCharArray();

        List<Integer> valueInRefTable = new ArrayList<>();
        for (char a : charArray) {
            Integer integer = refTable.get(a);
            valueInRefTable.add(integer);
        }

        this.offSetValueForOriginalText = refTable.get(this.offSet);

        for (Map.Entry<Character, Integer> entry : refTable.entrySet()) {

            if ((entry.getValue() + offSetValueForOriginalText) <= 43) {
                entry.setValue((entry.getValue() + offSetValueForOriginalText));
            } else {
                Integer newInteger = (entry.getValue() + offSetValueForOriginalText) - 44;
                entry.setValue(newInteger);
            }
        }
        List<Character> encodedMessage = new ArrayList<>();

        for (int i = 0; i < valueInRefTable.size(); i++) {

            for (Map.Entry<Character, Integer> entry : refTable.entrySet()) {
                if (entry.getValue() == valueInRefTable.get(i))
                    encodedMessage.add(entry.getKey());
            }
        }

        if (s.contains(" ")) {
            encodedMessage.add(s.indexOf(" "), ' ');
        }

        String encodedString = " ";
        for (Character d : encodedMessage) {
            String s1 = d.toString();
            encodedString += s1;
        }


        return encodedString.trim();

    }


    private static Map<Character, Integer> getRefTable() {
        Map<Character, Integer> referenceTable = new HashMap<>();
        Character alphaChar = 65;
        Character numChar = 48;
        for (int i = 0; i < 43; i++) {
            if (i <= 25) {
                referenceTable.put(alphaChar, i);
                alphaChar++;
            }
            if (i > 25 && i <= 35) {
                referenceTable.put(numChar, i);
                numChar++;
            }
        }
        referenceTable.put('(', 36);
        referenceTable.put(')', 37);
        referenceTable.put('*', 38);
        referenceTable.put('+', 39);
        referenceTable.put(',', 40);
        referenceTable.put('-', 41);
        referenceTable.put('.', 42);
        referenceTable.put('/', 43);
//        System.out.println(referenceTable);
        return referenceTable;
    }


}
