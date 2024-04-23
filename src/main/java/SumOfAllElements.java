import java.util.*;

public class SumOfAllElements {

    public static void main(String[] args) {

        System.out.println("Enter the number of elements in the array: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Integer [] array = new Integer[Integer.parseInt(s)];

        for(int i=0; i<array.length;i++){
            System.out.println("Enter " + i + " digit : ");
            String s1 = scanner.nextLine();
            array[i] = Integer.parseInt(s1);
        }


        List<Integer> listOfArray = (Arrays.asList(array));
        System.out.println(listOfArray);

        int sum=0;
        for(int a : listOfArray){

            sum+= a;
        }
        System.out.println(sum);

    }

}
