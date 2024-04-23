package DataStructure.string;

import java.util.Arrays;

public class StringStack {

    public static void main(String[] args) {
        String str = "abcd";

        StringReverser reverser = new StringReverser();
        String reverse = reverser.reverse(str);
        System.out.println(reverse);

//        String[] split = str.split("");
//        String[] reverseStr = new String[str.length()];
//        int index=0;
//        for (int i = str.length()-1; i >=0; i--) {
//            reverseStr[i] = split[index++];
//        }
//        String rev="";
//        for(String a:reverseStr){
//            rev = rev+a;
//        }
//        System.out.println(rev);

//        StringBuilder stringBuilder = new StringBuilder(str);
//        StringBuilder reverse = stringBuilder.reverse();
//        str = reverse.toString();
//        System.out.println(str);
    }

}
