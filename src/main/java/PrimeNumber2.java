import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PrimeNumber2 {

    public static void main(String[] args) {

        Long start = System.currentTimeMillis();
        System.out.println(getPrimeRange(100));
        Long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(getPrimeRange(10000).size());

    }

    private static List<Integer> getPrimeRange(int value) {

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <= value; i++) {
            if(checkPrime(i)) list.add(i);
        }
        return list;
    }

    private static boolean checkPrime(int number) {
        if (number <2) return false;
        System.out.println(Math.sqrt(number));
        for (int i = 2; i <=(Math.sqrt(number)); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }


}
