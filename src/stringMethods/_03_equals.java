package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
        /*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison is case-sensitive
        -It is non-static, and we call it with another String object
        -It is a return type and returns a boolean
        -It takes a String as an argument
         */

        System.out.println("Melda".equals("Melda")); // True
        System.out.println("melda".equals("Melda")); // False

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2));    // false
        System.out.println(name2.equals((name3)));  // true
    }
}
