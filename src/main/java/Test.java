import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {




    boolean checkAnagram (String a, String b){

        String[] stringArray1 = a.split("");
        String[] stringArray2 = b.split("");

        List<String> stringList = Arrays.asList(stringArray1);
        List<String> stringList1 = Arrays.asList(stringArray2);

        Collections.sort(stringList);
        Collections.sort(stringList1);

//        if (stringList.equals(stringList1)){
//            return true;
//        }
//        else {
//            return false;
//        }



        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);

    }

    public static void main(String[] args) {
        Test test = new Test();
        boolean b = test.checkAnagram("abcd", "dcba");
        System.out.println(b);


        String newString = "2345";
        String anotherString = "2345";

        System.out.println(newString.equals(anotherString));
    }

}
