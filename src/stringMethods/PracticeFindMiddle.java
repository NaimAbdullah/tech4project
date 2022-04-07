package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {

        String name1 = "Naim";
        String name2 = "Ahmad";

        char first = name1.charAt(0);
        char last = name1.charAt(name1.length()-1);

        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Bishr"));
        System.out.println(StringHelper.getMiddle("Alexander"));
    }
}
