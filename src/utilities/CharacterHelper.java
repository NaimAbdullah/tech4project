package utilities;

public class CharacterHelper {


    public static boolean isSpace(char c1){
        return c1 == ' ';
    }


    public static boolean isDigit(char c1){
        return c1 >= 48 && c1 <= 57;
    }


    public static boolean isUpperCase(char c1){
        return c1 >= 65 && c1 <= 90;
    }


    public static boolean isLowerCase(char c1){
        return c1 >= 97 && c1 <= 122;
    }


    public static boolean isLetter(char c1){
        return isUpperCase(c1) || isLowerCase(c1);
    }


    public static boolean isVowel(char c1){
        return c1 == 'A' || c1 == 'a' || c1 == 'E' || c1 == 'e' ||
                c1 == 'I' || c1 == 'i' || c1 == 'O' || c1 == 'o' ||
                c1 == 'U' || c1 == 'u';
    }


    public static boolean isConsonant(char c1){
        return isLetter(c1) &! isVowel(c1);
    }

    public static boolean isSpecial(char c1){
        return !Character.isLetter(c1) && !Character.isDigit(c1) && !Character.isSpaceChar(c1);
    }
}
