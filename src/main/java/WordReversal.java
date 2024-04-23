import java.util.Scanner;

public class WordReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words;
        System.out.print("Insert sentence: ");
        String s = scanner.nextLine();
        String[] split = s.split(" ");

        for(int i =split.length-1;i>=0;i--){

            System.out.print(split[i]+" ");
        }
        int x;
        x= 3/2;
        System.out.println(x);
    }





}
