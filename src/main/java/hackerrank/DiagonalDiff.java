package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiff {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int sizeOfSquareMatrix = arr.size();

        List<Integer> firstDiagonalNos = new ArrayList();
        List<Integer> secondDiagonalNos = new ArrayList();

        for (int i = 0; i < sizeOfSquareMatrix; i++) {
            firstDiagonalNos.add(arr.get(i).get(i));
        }
        for (int i = 0; i < sizeOfSquareMatrix; i++) {
            secondDiagonalNos.add(arr.get(i).get(sizeOfSquareMatrix - 1 - i));
        }

        int sumOfFirstDiagonal = (firstDiagonalNos.stream().reduce(Integer::sum).get());
        int sumOfSecondDiagonal = (secondDiagonalNos.stream().reduce(Integer::sum).get());

        int diff = Math.abs(sumOfFirstDiagonal - sumOfSecondDiagonal);


        return diff;

    }
}
