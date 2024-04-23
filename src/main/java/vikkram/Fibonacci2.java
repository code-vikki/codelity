package vikkram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fibonacci2 {

    public static void main(String[] args) {
//        int[] fibonacciSeries = getFibonacciSeries(1);
//        System.out.println(Arrays.toString(fibonacciSeries));
        int[] maxMinFiboNumbers = getMaxMinFiboNum(new int[]{13, 3, 15, 6, 8, 11});
        System.out.println(Arrays.toString(maxMinFiboNumbers));
    }

    public static int[] getAllFibonacciSeq(int noOfTerm) {

        if(noOfTerm<2) return new int[0];;

        int[] fibonacciArray= new int[noOfTerm];
        fibonacciArray[0]=0;
        fibonacciArray[1]=1;
        for(int i=2;i<noOfTerm;i++){
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }
       return fibonacciArray;


    }
    public static int[] getMaxMinFiboNum(int[] inputArray){
        Arrays.sort(inputArray);
        int max = inputArray[inputArray.length-1];
        List<Integer> fibonacciSeries = getFibonacciSeries(max);
        List<Integer> newList = new ArrayList<>();
        for(int integer:inputArray){
            if (fibonacciSeries.contains(integer))  newList.add(integer);
        }
        Integer min = Collections.min(newList);
        Integer max1 = Collections.max(newList);

        return null;
    }

    private static List<Integer> getFibonacciSeries(int maxNumber){

        List<Integer> fibonacciSeq = new ArrayList<>();
        fibonacciSeq.add(0,0);
        fibonacciSeq.add(1,1);
        int index=2;
        while(true){
            int value = fibonacciSeq.get(index - 1) + fibonacciSeq.get(index - 2);
            fibonacciSeq.add(index,value);
            if(value>=maxNumber) break;
            index++;
        }



        return fibonacciSeq;


    }
}

















//
//
//        if (noOfTerm < 2) {
//        System.out.println("Must be at least 2 terms");
//        int[] ints = {0, 1};
//        return ints;
//        }
//        int[] fibonacci = new int[noOfTerm];
//        fibonacci[0] = 0;
//        fibonacci[1] = 1;
//        for (int i = 0; i < fibonacci.length; i++) {
//        if ((i + 2) > fibonacci.length - 1) break;
//        fibonacci[i + 2] = fibonacci[i] + fibonacci[i + 1];
//        }
//        return fibonacci;
