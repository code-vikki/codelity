import java.util.*;

public class DisplaySmallestIntegerNotInArray {

    public static void main(String[] args) {
        int[] integerArray = new int []{1,2,4};

        int smallestPositiveIntNotInArray = getSmallestPositiveIntNotInArray(integerArray);
        System.out.println(smallestPositiveIntNotInArray);

    }

    private static int getSmallestPositiveIntNotInArray(int[] A) {
        Arrays.sort(A);
        Set<Integer> newset = new HashSet<Integer>();
        for(int a:A){
            newset.add(a);
        }
        List<Integer> newlist = new ArrayList<>(newset);

        for (int i = 0; i < newlist.size(); i++) {
            if (!(newlist.get(0) == 1)) {
                return 1;
            } else {
                if (!(newlist.get(i) == (i + 1))) {
                    return i+1;
                }
            }
        }
        return newlist.size()+1;
    }
}
