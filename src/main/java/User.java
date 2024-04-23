import java.util.Objects;

public class User {

    private String name;
    private String nric;
    private int age;

    public User(String name, String nric, int age) {
        this.name = name;
        this.nric = nric;
        this.age = age;
    }


//    @Override
//    public boolean equals(Object o) {
//        if(this==o) return true;
//
//        if (o instanceof User) {
//            User otherUser = (User) o;
//            return otherUser.nric == this.nric;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(nric);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return nric.equals(user.nric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nric);
    }
}
