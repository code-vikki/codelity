public class MergeSort {

    static void sort(int[] array) {
        if (array.length <2) return;
        int length = array.length;
        int middle = (length) / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int k = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < middle) {
                leftArray[k++] = array[i];
            } else {
                rightArray[j++] = array[i];
            }
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, array);


    }

    // [4,5] [1,2,3]

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int l = 0;
        int r = 0;
        int k = 0;

        while (l < leftArray.length && r < rightArray.length) {
            if (leftArray[l] > rightArray[r]) {
                array[k++] = rightArray[r++];
            } else {
                array[k++] = leftArray[l++];
            }
        }

        while (l < leftArray.length) {
            array[k++] = leftArray[l++];
        }
        while (r < rightArray.length) {
            array[k++] = rightArray[r++];
        }


    }
}
