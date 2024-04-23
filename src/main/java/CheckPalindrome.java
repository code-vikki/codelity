import java.util.Arrays;
import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        String splitString [];

        while (flag == true) {
            System.out.println("Enter the digit: ");
            String s;
            s = scanner.nextLine();
            splitString = s.split(""); // "Hi". ["h", "i]
            for (int i = 0; i < splitString.length; i++) { //
                char c = splitString[i].charAt(0);
                boolean digit = Character.isDigit(c);
                if (!digit) {;
                    flag=true;
                    break;
                } else{
                    flag=false;
                    continue;
                }
            }

            int length = splitString.length; // lets length 4
            String palindrome [] = new String[length];
            for(int i=0;i< splitString.length;i++){
                 palindrome[length-1]=splitString[i];
                 length--;

            }

            if(Arrays.equals(palindrome,splitString)){
                System.out.println("The digit is a Palindrome");
            } else{
                System.out.println("The digit is not a Palindrome");
            }
        }






    }
}

