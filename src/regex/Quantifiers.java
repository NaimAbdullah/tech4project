package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+", "hello"));
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello class hi"));
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", "zI2dnbdd"));
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(708)-860-8913"));

        String str = " abc 123 $#^ ";
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");

    }
}
