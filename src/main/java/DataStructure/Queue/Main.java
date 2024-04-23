package DataStructure.Queue;


import vikkram.Palindrome;

import java.util.*;

public class Main {

    String s;

    public static void main(String[] args) {
//
//        boolean isPalindrome = Palindrome.checkIfPalindrome("Radar");
//        System.out.println(isPalindrome);
//
//        List<Integer> lstOfInt = new ArrayList<>();
//
//
//        Optional<Integer> reduce = lstOfInt.stream()
//                .reduce((a, b) -> a + b);
//
//        System.out.println(reduce.orElse(0));

        List<Integer> lstOfFruit = new ArrayList<>();
        lstOfFruit.add(5);
        lstOfFruit.add(1);
        lstOfFruit.add(2);
        lstOfFruit.add(3);
        lstOfFruit.add(4);

        lstOfFruit.add(6);

        long apple = lstOfFruit.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(apple);

    }

    public static String solve(int width, int height, int length, int mass) {
        int volume = width * height * length;
        boolean bulky = false;
        boolean heavy = false;
        if (volume >= 1000000 || (width >= 150 || height >= 150 || length >= 150)) {
            bulky = true;
        }
        if (mass >= 20) {
            heavy = true;
        }

        if (!bulky && !heavy) return "STANDARD";
        if (bulky && heavy) return "REJECTED";
        if (bulky || heavy) return "SPECIAL";


        return "";
    }

    public static void reverse(Queue<Integer> queue) {
//10,20,30
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

    }
}
