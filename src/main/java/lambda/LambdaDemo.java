package lambda;

public class LambdaDemo {

    public static void show() {
        Printer printer = message -> System.out.println(message+5);
        greet(printer);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
    
}
