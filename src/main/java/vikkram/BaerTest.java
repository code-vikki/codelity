package vikkram;

import col.Movie;

import java.io.File;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class BaerTest  {

    public BaerTest() {
        System.out.println("Bear");
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Jaws",100);
        Movie movie2 = new Movie("Jurassic Park",120);
        Movie movie3 = new Movie("Jaws",100);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        Map<String, List<Movie>> collect = movieList.stream()
                .
                .collect(Collectors.groupingBy(movie -> movie.getName()));


    }




}

