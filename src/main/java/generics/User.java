package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
         List<String> names = new ArrayList<>();
        List<String> toys = new ArrayList<>();

        names.add("Manju");

         //traditional for loop
        extracted(names);
        extracted(names);
        extracted(names);


        //Lambdas 8 - declarative


        Consumer<String> printConsumer = (a) ->{
                System.out.println(a);
         };


        names.forEach(printConsumer);

        toys.forEach(printConsumer);
        toys.forEach(printConsumer);
        toys.forEach(printConsumer);

        
    }

    private static void extracted(List<String> names) {
        for (String user : names) {
            System.out.println(user);
        }
    }
}
