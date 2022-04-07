package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {


        System.out.println("\n--------------- TASK 1 ---------------\n");

        int[] numbers = new int[10];

        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        System.out.println("\n--------------- TASK 2 ---------------\n");

        String[] letters = new String[5];
        letters[1] = "abc";
        letters[4] = "xyz";

        System.out.println(letters[3]);
        System.out.println(letters[0]);
        System.out.println(letters[4]);
        System.out.println(Arrays.toString(letters));


        System.out.println("\n--------------- TASK 3 ---------------\n");

        int[] numbersT3 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbersT3));
        Arrays.sort(numbersT3);
        System.out.println(Arrays.toString(numbersT3));


        System.out.println("\n--------------- TASK 4 ---------------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n--------------- TASK 5 ---------------\n");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));

        boolean containPluto = false;

        for (String dog : dogs) {
            if(Arrays.toString(dogs).contains("Pluto")) containPluto = true;
        }
        System.out.println(containPluto);


        System.out.println("\n--------------- TASK 6 ---------------\n");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        boolean containsGAndF = false;

        for (String cat : cats) {
            if(Arrays.toString(cats).contains("Garfield") && Arrays.toString(cats).contains("Felix")){
                containsGAndF = true;
            }
        }
        System.out.println(containsGAndF);


        System.out.println("\n--------------- TASK 7 ---------------\n");

        double[] numbersT7 = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(numbersT7));

        for (double element : numbersT7) {
            System.out.println(element);
        }


        System.out.println("\n--------------- TASK 8 ---------------\n");

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(chars));

        int letter = 0;
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (char c : chars) {
            if(CharacterHelper.isLetter(c)) {
                letter++;
                if(CharacterHelper.isUpperCase(c)){
                    upper++;
                }
                else lower++;
            }
            else if(CharacterHelper.isDigit(c)) digit++;
            else special++;
        }

        System.out.println("Letters = " + letter);
        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Digits = " + digit);
        System.out.println("Special characters = " + special);


        System.out.println("\n--------------- TASK 9 ---------------\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));

        upper = 0;
        lower = 0;
        int b_p = 0, book_pen = 0;

        for (String element : objects) {
            if(CharacterHelper.isUpperCase(element.charAt(0))){
                upper++;
            }
            else lower++;

            if(element.toLowerCase().charAt(0) == 'b' || element.toLowerCase().charAt(0) == 'p') b_p++;
            if(element.toLowerCase().contains("book") || element.toLowerCase().contains("pen")) book_pen++;
        }
        System.out.println("Elements start with uppercase = " + upper);
        System.out.println("Elements start with lowercase = " + lower);
        System.out.println("Elements starting with B or P = " + b_p);
        System.out.println("Elements having \"book\" or \"pen\" = " + book_pen);


        System.out.println("\n--------------- TASK 10 ---------------\n");

        int[] numbersT9 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbersT9));

        int less10 = 0, more10 = 0, equal10 = 0;

        for (int num : numbersT9) {
            if(num > 10){
                more10++;
            }else if(num < 10) less10++;
            else equal10++;
        }

        System.out.println("Elements that are more than 10 = " + more10);
        System.out.println("Elements that are less than 10 = " + less10);
        System.out.println("Elements that are 10 = " + equal10);


        System.out.println("\n--------------- TASK 11 ---------------\n");

        int[] array1 = {5, 8, 13, 1, 2};
        int[] array2 = {9, 3, 67, 1, 0};

        int[] array3 = new int[5];

        for (int i = 0; i < array3.length; i++) {
            if(array1[i] > array2[i]){
                array3[i] = array1[i];
            }
            else array3[i] = array2[i];
        }

        System.out.println("1st array is = " + Arrays.toString(array1));
        System.out.println("2nd array is = " + Arrays.toString(array2));
        System.out.println("3rd array is = " + Arrays.toString(array3));

        System.out.println("\nEnd of the program!");
    }
}
