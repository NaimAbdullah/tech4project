package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {

        char c = '9';
        boolean b = Character.isDigit(c);
        System.out.println(b); // True

        System.out.println(Character.isDigit('9')); // True

        System.out.println(Character.isUpperCase('a')); // False
        System.out.println(Character.isUpperCase('B')); // True

        System.out.println(Character.isLowerCase('G')); // False
        System.out.println(Character.isLowerCase('h')); // True

        System.out.println(Character.isLetter('s')); // True
        System.out.println(Character.isLetter('Z')); // True

        System.out.println(Character.isLetterOrDigit('4')); // True
        System.out.println(Character.isLetterOrDigit('t')); // True
        System.out.println(Character.isLetterOrDigit('%')); // False

        System.out.println(Character.isWhitespace(' ')); // True
        System.out.println(Character.isSpaceChar(' ')); // True

        char c2 = '-';

        System.out.println(!Character.isLetterOrDigit(c2) && !Character.isSpaceChar(c2)); // True

        char c3 = 'A';
        String s = "AEIOUaeiou";
        System.out.println(s.contains(c3 + "")); // True

        char c4 = 'a';
        boolean isC4Vowel = false;

        for (int i = 0; i < s.length(); i++) {
            if(c4 == s.charAt(i)){
                isC4Vowel = true;
                break;
            }
        }
    }
}
