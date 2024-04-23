package DataStructure;

public class Array {

    private int length;
    private int[] array;
    private int index;
    private int count;

    public Array(int length) {
        this.length = length;
        this.array = new int[length];

    }

    public void insert(int x) {
        if (index < length) {
            array[index++] = x;
            count++;
            return;
        }
        int[] newArray = new int[length * 2];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        newArray[index++] = x;
        count++;
        length = length * 2;
        this.array = newArray;
    }

    //4,2,1
    //index=1 count=3
    //new int[2]  [x,y]
    //[4,
    public void removeAt(int index) {
        int newArrayLength = count - 1;
        int newArrayIndex = 0;
        int[] newArray = new int[newArrayLength];
        for (int j = 0; j < count; j++) {
            if (j != index) {
                newArray[newArrayIndex] = array[j];
                newArrayIndex++;
            }
        }
        array = newArray;
        count=newArrayLength;
    }

    public int indexAt(int x){
        for(int i=0;i<count;i++){
            if(array[i]==x){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < count; i++) {
            stringBuilder.append(array[i]).append(",");
        }
        int lastIndexOfComma = stringBuilder.lastIndexOf(",");
        stringBuilder.deleteCharAt(lastIndexOfComma);
        stringBuilder.append("]");
        return stringBuilder.toString();

    }
}
