package abstractclass;

public abstract class Animal {
    protected String name;

    protected Animal(String name){
        this.name = name;
    }

    abstract void makeSound();
}
