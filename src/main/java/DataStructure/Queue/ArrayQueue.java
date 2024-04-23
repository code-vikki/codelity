package DataStructure.Queue;

import java.util.Arrays;

public class ArrayQueue {

    private Integer[] arrayOfElement = new Integer[5];
    private Integer first;
    private Integer last;

    public boolean add(Integer integer) {

        for (int i = 0; i < 5; i++) {
            if (arrayOfElement[i] == null) {
                arrayOfElement[i] = integer;
                setValueForFirstAndLast();
                return true;
            }
        }
        return false;
    }

    public boolean remove() {
        if (first != null) {
            if ((indexOf(first) + 1) < 5) {
                first = arrayOfElement[indexOf(first) + 1];
                return true;
            }
        }
        first = null;
        return false;
    }

    public int indexOf(int x) {
        for (int i = 0; i < 5; i++) {
            if (arrayOfElement[i] == x) return i;
        }
        return -1;
    }

    public Integer peek() {
        return first;
    }

    public boolean isEmpty() {
        return peek() == null ? true : false;
    }

    public boolean isFull() {
        if (arrayOfElement[4] != null) return true;
        else return false;
    }


    public void setValueForFirstAndLast() {
        first = arrayOfElement[0];
        for (int i = 0; i < 5; i++) {
            if (arrayOfElement[i] == null) {
                last = arrayOfElement[i - 1];
                return;
            }
        }
        last = arrayOfElement[arrayOfElement.length - 1];
    }

    @Override
    public String toString() {
        String arrayString = "[";

        if (first != null) {
            for (int i = indexOf(first); i < 5; i++) {
                if (arrayOfElement[i] != null) {
                    arrayString += arrayOfElement[i] + ",";
                }
            }
            arrayString = arrayString.substring(0, arrayString.lastIndexOf(",")) + "]";

        } else {
            arrayString = arrayString + "]";
        }
        return arrayString;

    }
}
