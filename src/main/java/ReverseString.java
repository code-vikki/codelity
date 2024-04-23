import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String s = scanner.nextLine();
        getReverseString(s);
    }

    private static void getReverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println( stringBuilder.reverse());
    }

}
