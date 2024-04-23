import java.util.Arrays;
import java.util.Collections;

public class BinarySort {

    public static void main(String[] args) {

        int[] sortedArray= new int[] {66,1,54,3};
        Arrays.sort(sortedArray);
        long l = System.nanoTime();
        int i = runBinarySearchIteratively(sortedArray, 0, 4, 1);
        long l1 = System.nanoTime();
        System.out.println(l1-l);
        if(i==Integer.MAX_VALUE){
            System.out.println("The element is not in the array");
        } else{
            System.out.println("The index of the searched number is "+ i);
        }




    }


    public static int runBinarySearchIteratively(int[] sortedArray,int low,int high,int key){
        int index = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low+ ((high-low)/2);
            if(sortedArray[mid]>key){
                high=mid-1;
            } else if (sortedArray[mid]<key){
                low=mid+1;
            } else if(sortedArray[mid]==key){
                index=mid;
                break;
            }
        }
        return index;

    }


}
