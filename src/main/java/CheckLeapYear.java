import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = Integer.parseInt(s);
        if(checkLeapYear(i)){
            System.out.println("Year entered is a leap ");
        }else{
            System.out.println("Not a leap year");
        }
    }


    public static boolean checkLeapYear(int year) {
        boolean leap = Year.isLeap(year);
        return leap;
    }


}
