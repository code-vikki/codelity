package hackerrank;

import java.util.Comparator;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {

    }
    public static void countingSort(List<Integer> arr) {
        // Write your code here
        int sizeOfList = arr.size();
        Integer max = arr.stream().max(Comparator.comparingInt(a -> a)).get();

        int maxValue = Integer.MIN_VALUE;

        for(int a:arr){
            maxValue=Math.max(maxValue,a);
        }

        int[] frequencyArray = new int[maxValue+1];

        for (int i = 0; i < sizeOfList; i++) {
            frequencyArray[arr.get(i)]++;
        }


        Integer[] integers = arr.toArray((new Integer[0]));

        int k=0;
        for(int i=0;i<frequencyArray.length;i++){
            for(int j=0;j<frequencyArray[i];j++){
                integers[k++] = i;
            }
        }

//        List<Integer> frequencyList = new ArrayList<>();
//        for (int a : frequencyArray) {
//            frequencyList.add(a);
//        }
//
//        return frequencyList;


    }
}
