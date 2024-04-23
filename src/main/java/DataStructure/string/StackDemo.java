package DataStructure.string;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(7);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.push(5);
        System.out.println(stack);
    }
}
