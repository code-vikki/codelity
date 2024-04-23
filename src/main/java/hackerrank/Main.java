package hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(findMedian(list));
//        plusMinus(list);

//        List<Integer> secondList = new ArrayList<>();
//        secondList.add(1);
//        secondList.add(3);
//        secondList.add(5);
//        secondList.add(7);
//        secondList.add(9);
//
//        miniMaxSum(secondList);

//        System.out.println(timeConversion("12:00:00PM"));
//
//        System.out.println(lonelyinteger(list));
//
        List<List<Integer>> squareMatrix = new ArrayList<>();
        squareMatrix.add(new ArrayList<>(Arrays.asList(112, 42, 83, 119)));
        squareMatrix.add(new ArrayList<>(Arrays.asList(56, 125, 56, 49)));
        squareMatrix.add(new ArrayList<>(Arrays.asList(15, 78, 101, 43)));
        squareMatrix.add(new ArrayList<>(Arrays.asList(62, 98, 114, 108)));
//
//        System.out.println(diagonalDifference(squareMatrix));
//
//        List<Integer> listOfInteger = new ArrayList<>();
//        listOfInteger.add(1);
//        listOfInteger.add(2);
//        listOfInteger.add(3);
//        listOfInteger.add(4);
        System.out.println(flippingMatrix(squareMatrix));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                countPositive++;
            }
            if (integer < 0) countNegative++;
            if (integer == 0) countZero++;
        }
        double totalCount = countNegative + countPositive + countZero;
        double positiveRatio = countPositive / totalCount;
        double negativeRatio = countNegative / totalCount;
        double zeroRatio = countZero / totalCount;

        System.out.printf("%.5f%n", positiveRatio);
        System.out.printf("%.5f%n", negativeRatio);
        System.out.printf("%.5f%n", zeroRatio);

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int minSum = 0;
        int maxSum = 0;
        Collections.sort(arr);
        for (int i = 0; i < 4; i++) {

            minSum += arr.get(i);

            maxSum += arr.get(i + 1);

        }
        System.out.printf("%d %d", minSum, maxSum);

    }

    public static String timeConversion(String s) {
        // Write your code here
        String DATE_TIME_FORMAT = "hh:mm:ssa";
        String REQ_DATE_TIME_FORMAT = "HH:mm:ss";
        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern(REQ_DATE_TIME_FORMAT);

        LocalTime localTime = LocalTime.parse(s, format);


        return localTime.format(newFormat);
    }

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        //odd no of elements
         Collections.sort(arr);
        //3 elements 1 middle n+1 / 2
        // 5 element 2 middle  n+1/2
        // 7        3 middle   7-3
        int indexInMiddle = (arr.size()-1)/2;
        return arr.get(indexInMiddle);

    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            int newCount = 0;
            Integer integer = map.get(a.get(i));
            if (integer != null) {
                Integer count = map.get(a.get(i));
                map.put(a.get(i), ++count);
            } else {
                map.put(a.get(i), ++newCount);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;

    }


    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size() / 2;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxValue = Math.max(matrix.get(i).get(j),
                               Math.max(matrix.get(i).get(2 * n - j - 1),
                                       Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1))));
                maxSum+=maxValue;
            }
        }

       return  maxSum;
    }

}
