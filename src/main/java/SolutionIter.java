import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class SolutionIter {

    public SolutionIter(Reader inp) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        int read = inp.read();
        while (read != -1) {
            char read1 = (char) read;
            stringBuilder.append(read1);
            read = inp.read();
        }

        String toString = stringBuilder.toString();
        String[] split = toString.split(",");

        for (String a : split) {

            System.out.println(a);


        }

    }

    public static void main(String[] args) throws IOException {
        Reader inp = new FileReader("C:\\Users\\natam\\OneDrive\\Desktop\\Vikkram\\Codelity\\src\\main\\resources\\input.txt");
        SolutionIter solutionIter = new SolutionIter(inp);
    }


}
