package DataStructure.string;

public class ComplierDemo {
    public static void main(String[] args) {

        Complier complier = new Complier();
        boolean compliationError = complier.checkSyntax("(hi)");
        System.out.println(compliationError);
    }
}
