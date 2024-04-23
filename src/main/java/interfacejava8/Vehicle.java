package interfacejava8;

public interface Vehicle {

    int x = 10;

    void start();

    static void doSomething(){
        System.out.println("Hi");
    }

    default int calculatorSomething(int x){
        return this.x;
    }
}
