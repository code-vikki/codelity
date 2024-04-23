import java.util.Scanner;

public class PrimeNumberChecker {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String loopcontrol = "y";
        while (loopcontrol.equals("y")) {
            try {
                System.out.println("Key in a number to check if prime: ");
                int i = scanner.nextInt();
                if (checkPrime(i)) {
                    System.out.println("Number is prime");
                } else {
                    System.out.println("Number is not prime");
                }
                do {
                    System.out.print("Continue? Y or N: ");
                    loopcontrol = scanner.next();
                    if (loopcontrol.equals("y")) {
                        break;
                    }
                    if (loopcontrol.equalsIgnoreCase("n")) return;
                } while (!loopcontrol.equals("y") || !loopcontrol.equals("n"));

            } catch (RuntimeException e) {
                scanner.nextLine();
                loopcontrol = "y";

            }
        }
    }

    //1,2,3,4,5,6

    private static boolean checkPrime(int numToCheck) {
        for (int i = 2; i < numToCheck; i++) {
            if (numToCheck % i == 0) return false;
        }
        return true;
    }


}
