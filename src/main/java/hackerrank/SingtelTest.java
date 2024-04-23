package hackerrank;

public class SingtelTest {
    public static void main(String[] args) {
        System.out.println(findMaxNum(4,4,6));

    }

    public static int findMaxNum(int x, int y, int z) {

        // Write your code here

        if (Math.abs(x - y) > z) {
            return -1;
        }
        if (Math.abs(x - y) == z) {
            return x;
        }


        int extraSteps = (z - (Math.abs(x - y))) / 2;
        return x + extraSteps;


    }
}
