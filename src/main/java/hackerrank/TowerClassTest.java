package hackerrank;

public class TowerClassTest {

    public static void main(String[] args) {


    }
    public static int towerBreakers(int n, int m) {
        // Write your code here
        //n no of tower
        //m height of tower
        // 2,2  2,1
        if (n == 1 && m > 1) {
            return 1;
        }
        // If there are multiple towers and all of them have a height of 1, the second player wins.
        else if (n > 1 && m == 1) {
            return 2;
        }
        // Otherwise, if the number of towers is even, the second player wins; if odd, the second player wins.
        else {
            return (n % 2 == 0) ? 2 : 1;
        }
    }
}
