import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static int calculateTotalPrice(int[] prices, int discount) {
        double total = 0.0;
        float discountInPercent = discount / 100.0f;
        for (int p : prices){

            total = total +  (p * discountInPercent);
        }

        long round = Math.round(total);
        System.out.println(round);
        return (int)round;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        int discount = 30;
        int[] prices = new int[]{1000,30000,1,90};
        int price = calculateTotalPrice(prices, discount);

    }
    // #endregion
}