import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = {1,2,3};
        sort(ints);
        Arrays.sort(ints);
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 1; j < array.length; j++) {

                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swap = true;
                }

            }
            if (!swap) return;

        }
    }

}
