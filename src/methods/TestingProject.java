package methods;

import utilities.CharacterHelper;

public class TestingProject {
    public static void main(String[] args) {

        System.out.println(CharacterHelper.isSpace(' '));


        System.out.println(CharacterHelper.isUpperCase('t'));


        char c3 = 't';
        System.out.println(CharacterHelper.isDigit(c3));


        char c4 = 'R';
        System.out.println(CharacterHelper.isLowerCase(c4));


        char c5 = '5';
        System.out.println(CharacterHelper.isLetter(c5));


        char c6 = 'a';
        System.out.println(CharacterHelper.isVowel(c6));


        char c7 = 'q';
        System.out.println(CharacterHelper.isConsonant(c7));
    }
}
