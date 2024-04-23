package annotatoin;

@Animal(age = 4)
public class Main {
    private int age;

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
             Main main = new Main();
        System.out.println(main.getAge());
    }
}
