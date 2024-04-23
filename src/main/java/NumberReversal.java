import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberReversal {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        String s1 = scanner.nextLine();
        String[] firstList= (s1.split(""));
        getReverse(firstList);
    }

    private static void getReverse(String[] firstList) {

        List<String> newList = new ArrayList<>();

        for(String a: firstList)
        {
            newList.add(a);
        }

        if(newList.contains(".")) {
            int index = newList.indexOf(".");
            newList.remove(".");
            System.out.println(newList);
            List<String> newestList = new ArrayList<>();

            for(int i= newList.size()-1; i>=0;i--){

                newestList.add(newList.get(i));
            }

            newestList.add(index,".");


            for(String a:newestList){
                System.out.print(a);
            }


        }else
            for(int i= newList.size()-1; i>=0;i--){
                System.out.print(newList.get(i));
            }
    }

}
