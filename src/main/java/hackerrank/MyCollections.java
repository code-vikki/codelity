package hackerrank;

import java.util.*;

public class MyCollections {

    public static void main(String[] args) {
//        Set<Employee> mySet = new HashSet();
//        mySet.add(new Employee("vikkram", 39));
//        mySet.add(new Employee("vikkram", 39));
//        System.out.println(mySet);
//
//        Map<Integer,Employee> myMap = new HashMap<>();
//        Employee priya3 = new Employee("priya", 42);
//        Employee priya4 = new Employee("priya", 43);
//        Employee priya = myMap.put(1, priya3);
//        Employee priya1 = myMap.put(1, priya4);
//
//
//        System.out.println(priya);
//        System.out.println(priya1);
//
//        Employee employee1 = new Employee("manju",3);
//        Employee employee2 = new Employee("vjay",1);
//        Employee employee3 = new Employee("vikky",39);
//        Employee employee4 = new Employee("priya",42);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList.add(employee3);
//        employeeList.add(employee4);
//        Collections.sort(employeeList,new AgeComparator());
//        System.out.println(employeeList);
        String firstRepeatedChar = returnFirstRepeatedChar("a green apple");
        String nonRepeatedChar = returnFirstNonRepeatedChar("a green apple");
        System.out.println(nonRepeatedChar);
        System.out.println(firstRepeatedChar);


    }

    private static String returnFirstRepeatedChar(String anyString) {
        Set<Character> set = new HashSet();

        for (char character : anyString.toCharArray()) {
            if (!set.add(character)) return character+"";
        }

        return Character.MIN_VALUE+"";

    }

    private static String returnFirstNonRepeatedChar(String anyString) {
        String whiteSpaceRemoved = anyString.replaceAll(" ", "");
        char[] chars = whiteSpaceRemoved.toCharArray();
        Map<Character, Integer> charMap = new HashMap();

        for (char character : chars) {
            Integer integer = charMap.get(character);
            if (integer != null) {
                charMap.put(character, ++integer);
            } else {
                charMap.put(character, 1);
            }
            ;
        }

        for (char character : chars) {
            Integer integer = charMap.get(character);
            if (integer == 1) return character + "";
        }

        return "";
    }
}
