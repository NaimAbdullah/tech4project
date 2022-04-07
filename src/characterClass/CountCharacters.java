package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {

        /*
        TASK-1
        Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("\n---TASK-1---\n");

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int count = 0;

        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);

        /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */

        System.out.println("\n---TASK-2---\n");

        int letter = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isLetter(address.charAt(i))){
                letter++;
            }
        }
        System.out.println(letter);


        /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("\n---TASK-3---\n");

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isUpperCase(address.charAt(i))){
                upper++;
            }
            else if(Character.isLowerCase(address.charAt(i))){
                lower++;
            }
        }

        System.out.println(lower - upper);


        /*
        TASK-4
        Write a program that counts vowel and consonants letters for below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Vowels = 10
        Consonants = 15
         */

        System.out.println("\n---TASK-4---\n");

        int vowel = 0, consonant = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isLetter(address.charAt(i))){
                if(CharacterHelper.isVowel(address.charAt(i))){
                    vowel++;
                }
                else consonant++;
            }
        }
        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonant);


        /*
        TASK-5 - Putting all together
        Write a program that characters from the below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Letters = 25
        Lowercases = 17
        Uppercases = 8
        Vowels = 10
        Consonants = 16
        Digits = 12
        Spaces = 9
        Specials = 2
         */

        System.out.println("\n---TASK-5---\n");
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                letterCounter++;
                if(Character.isUpperCase(c)){
                    upperCounter++;
                }
                else{
                    lowerCounter++;
                }

                if(CharacterHelper.isVowel(c)){
                    vowelCounter++;
                }
                else{
                    consonantCounter++;
                }
            }
            else if(Character.isDigit(c)){
                digitCounter++;
                if(Integer.parseInt("" + c) % 2 == 0){
                    evenCounter++;
                }
                else{
                    oddCounter++;
                }
            }
            else if(Character.isSpaceChar(c)){
                spaceCounter++;
            }
            else{
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);

    }
}
