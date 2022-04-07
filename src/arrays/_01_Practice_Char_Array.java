package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {

        System.out.println("\n------Task-1------\n");

        char[] character = {'#', '$', '5', 'A', 'b', 'H'};

        System.out.println(Arrays.toString(character));


        System.out.println("\n------Task-2------\n");

        System.out.println("The size of the array is = " + character.length);


        System.out.println("\n------Task-3------\n");

        for (int i = 0; i < character.length; i++) {
            System.out.println(character[i]);
        }


        System.out.println("\n------Task-4------\n");

        for(char element : character){
            System.out.println(element);
        }


        System.out.println("\n------Task-5------\n");

        for (int i = 0; i < character.length; i++) {
            if(CharacterHelper.isLetter(character[i])){
                System.out.println(character[i]);
            }
        }


        System.out.println("\n------Task-6------\n");

        int count = 0;

        for (int i = 0; i < character.length; i++) {
            if(CharacterHelper.isUpperCase(character[i])){
                count++;
            }
        }
        System.out.println(count);

    }
}
