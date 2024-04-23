import java.util.Scanner;



public class PrintNumInRange {

    private String fizz;
    private String buzz;
    private String fizzBuzz;

    public PrintNumInRange() {
        this.fizz = "Fizz";
        this.buzz = "Buzz";
        this.fizzBuzz = "FizzBuzz";
    }


    public void changeFizzBuzzMsg(String fizz, String buzz, String fizzBuzz){
        this.fizz=fizz;
        this.buzz=buzz;
        this.fizzBuzz=fizzBuzz;
    }

    public void getPrintNumFromRange(int a, int b) {


        for (int i = a; i <= b; i++) {

            if (i != 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(fizzBuzz + i);
                } else if (i % 3 == 0) {
                    System.out.println(fizz + i);
                } else if (i % 5 == 0) {
                    System.out.println(buzz + i);
                } else {
                    System.out.println(i);
                }
            }
            if(i==0){
                System.out.println(i);
            }
        }


    }

}


