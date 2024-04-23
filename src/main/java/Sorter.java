public class Sorter {

    //[2,3,1]

    static void selectionSort(int[] array){
        if(array==null||array.length==0 ) return;
        for(int i=0;i<array.length;i++){
            int min=array[i];
            for(int j=i;j<array.length;j++){
                if(array[j]<min){
                    min=array[j];
                    swap(array, i, min, j);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int min, int j) {
        int temp = array[i];
        array[i] = min;
        array[j]=temp;
    }


}
