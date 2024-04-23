package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private void getUsers(List<? extends User> users) {

        Instructor vikkram = new Instructor("vikkram");

        //users.add(user);
    }

    public static void main(String[] args) {
        Main main  = new Main();

        List<User> users = new ArrayList<>();
        Instructor vikkram = new Instructor("vikkram");
        Admin priya = new Admin("priya");
        User manju = new User("manju");

        users.add(vikkram);
        users.add(priya);
        users.add(manju);

        List<Integer> newList=new ArrayList<>();
        newList.add(1);


        main.getUsers(users);
    }
}