package streams;

import col.Movie;

import java.util.*;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Movie> lstOfMovie = new ArrayList<>();
        lstOfMovie.add(new Movie("Beast", 100));
        lstOfMovie.add(new Movie("Varisu", 20));

        int x = 1;

        int y= lstOfMovie.stream()
                .map(movie -> movie.getLike())
                .reduce(Integer::sum).orElse(1);
        System.out.println(y);
//        ArrayList list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//
//        int n = 4;
//        Object o = list.stream()
//                .sorted()
//                .distinct()
//                .findFirst().get();
//
//
//        System.out.println(o);


    }

}
