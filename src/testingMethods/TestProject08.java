package testingMethods;

import projects.Project08;
import java.util.ArrayList;

public class TestProject08 {
    public static void main(String[] args) {

        String[] isWords = {"hello there", " ", "", "Hello"};
        System.out.println(Project08.countMultipleWords(isWords));


        ArrayList<Integer> positive = new ArrayList<>();
        positive.add(2);
        positive.add(-5);
        positive.add(6);
        positive.add(7);
        positive.add(-10);
        positive.add(-78);
        positive.add(0);
        positive.add(15);
        System.out.println(Project08.removeNegatives(positive));

        String password = "Abcd1234";
        System.out.println(Project08.validatePassword(password));

        String email = "ay@gd.ml";

        System.out.println(Project08.validateEmailAddress(email));
    }
}
