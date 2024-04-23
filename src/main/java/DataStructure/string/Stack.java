package DataStructure.string;

import java.util.Arrays;

public class Stack {

    private int count;
    private int length;
    private int[] array = new int[length];

    public void push(int x) {

        if (count < length) array[count++] = x;
        else {
            int newLength = length+1;
            int[]newArray=new int[newLength];
            for(int i=0;i<length;i++){
                newArray[i]= array[i];
            }
            array=newArray;
            length=newLength;
            array[count++] = x;
        } ;
    }

    public int pop(){
        int[] newArray=new int[length-1];
        for(int i=0;i<length-1;i++){
            newArray[i] =array[i];
        }
        int last=array[length-1];
        array=newArray;
        length=length-1;
        count =count-1;
        return last;
    }

    @Override
    public String toString() {

        return Arrays.toString(array);
    }
}
