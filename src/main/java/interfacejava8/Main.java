package interfacejava8;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle.doSomething();
        System.out.println(car.calculatorSomething(3));
    }
}
