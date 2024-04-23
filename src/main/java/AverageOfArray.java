import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {

    public static void main(String[] args) {

        double[] arrayOfNum = getArrayElements();
        getAverage(arrayOfNum);

    }

    private static double[] getArrayElements(){
        Scanner scanner = new Scanner(System.in);
        char c = ' ';
        boolean isDigit = false;

        while (!isDigit) {
            System.out.print("Enter size of array: ");
            String s = scanner.nextLine();
            c = s.charAt(0);
            isDigit = Character.isDigit(c);
        }
        int arraySize = Integer.parseInt(String.valueOf(c));
        double[] arrayOfNum = new double[arraySize];

        System.out.println("Enter numbers in the array: ");

        for (int i = 0; i < arrayOfNum.length; i++) {
            boolean digit = false;

            while(!digit) {
                System.out.print("Enter " + "[" + i + "] " + "number: ");
                String s = scanner.nextLine();
                digit = isDigit(s);
                if (digit) {
                    double v = Double.parseDouble(s);
                    arrayOfNum[i] = v;
                } else {
                    System.out.print("Enter digit again:");
                }
            }
        }
        return arrayOfNum;
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static void getAverage(double [] arrayOfNum){

        double sum = 0;
        for (double a : arrayOfNum) {
            sum += a;
        }

        double average = sum / arrayOfNum.length;
        String s1 = Arrays.toString(arrayOfNum);
        System.out.println(s1);
        System.out.println("Average of the elements in the Array is " + average);
    }


}



