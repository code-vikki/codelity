import java.util.Locale;

public class ExceptionDemo {

    public static void show(){
        sayHello(null);
    }

    private static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
