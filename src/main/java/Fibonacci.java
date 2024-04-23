import java.util.Scanner;

public class Fibonacci {

    public static void Fibonacci(int n){

        int num1 =0;
        int num2=1;

        for(int i=0;i<n;i++){
            System.out.print(num1+" ");

            int num3=num2+num1;
            num1=num2;
            num2=num3;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first nth Fibonacci series: ");
        int n = Integer.parseInt(scanner.nextLine());

        Fibonacci(n);


    }
}
