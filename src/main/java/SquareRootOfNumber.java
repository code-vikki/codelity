import java.util.Scanner;

public class SquareRootOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to find the square root: ");
        double i = Double.parseDouble(scanner.nextLine());
        getSquareRoot(i);
    }

    private static void getSquareRoot(double i) {
        double pow = Math.pow(i, 0.5);
        System.out.printf("Square root of " + i + " is " + "%.2f", pow);
    }
}
