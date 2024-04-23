package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> listOfcustomer = new ArrayList<>();
        listOfcustomer.add(new Customer("a", "n1"));
        listOfcustomer.add(new Customer("c", "n8"));
        listOfcustomer.add(new Customer("b", "n7"));

        Collections.sort(listOfcustomer,new EmailComparator());

        System.out.println(listOfcustomer);

    }


}
