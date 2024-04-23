import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        printPrimeNo(100);

    }

    private static void printPrimeNo(int range) {

        List<Integer> primeList = new ArrayList();
        for (int i = 0; i <= range; i++) {

            if (checkIfPrime(i)) {
                primeList.add(i);
            }
        }

        System.out.println(primeList);
        System.out.printf("Total %d numbers in the list",primeList.size());


    }

    private static boolean checkIfPrime(int value) {
        if (value < 2) return false;

        for (int i = 2; i <= value/2; i++) {

            if (value % i == 0) return false;

        }


        return true;
    }

}
