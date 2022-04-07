package projects;

public class Project03 {
    public static void main(String[] args){

        /*
        ---------------TASK 1---------------

        PSEUDO - CODE:
        1. Create string variables
        2. Create math equations and convert string to int
        3. Print out results
         */

        System.out.println("--------------- TASK 1 ---------------");

        String s1 = "24", s2 = "5";

        System.out.println("The sum of 24 and 5 = " + (Integer.parseInt(s1) + Integer.parseInt(s2)));
        System.out.println("The subtraction of 24 and 5 = " + (Integer.parseInt(s1) - Integer.parseInt(s2)));
        System.out.println("The division of 24 and 5 = " + (Double.parseDouble(s1) / Double.parseDouble(s2)));
        System.out.println("The multiplication of 24 and 5 = " + (Integer.parseInt(s1) * Integer.parseInt(s2)));
        System.out.println("The remainder of 24 and 5 = " + (Integer.parseInt(s1) % Integer.parseInt(s2)));

        System.out.println();


        /*
        ---------------TASK 2---------------

        PSEUDO - CODE:
        1.
        2.
        3.
         */

        System.out.println("--------------- TASK 2 ---------------");

        int randomT2 = (int) (Math.random() * 35) + 1;
        System.out.println("Random number is = " + randomT2);

        if(randomT2 == 2 || randomT2 == 3 || randomT2 == 5 || randomT2 == 7 || randomT2 == 11 ||
                randomT2 == 13 || randomT2 == 17 || randomT2 == 19 || randomT2 == 23 ||
                randomT2 == 29 || randomT2 == 31){
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }
        else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

        System.out.println();


        /*
        ---------------TASK 3---------------

        PSEUDO - CODE:
        1. Create random number generator
        2. Print out each number
        3. Create if else statements to find lowest, middle, and greatest number
         */

        System.out.println("--------------- TASK 3 ---------------");

        int random1T3 = (int) (Math.random() * 50) + 1, random2T3 = (int) (Math.random() * 50) + 1,
        random3T3 = (int) (Math.random() * 50) + 1;

        System.out.println("Number 1 = " + random1T3 + "\nNumber 2 = " + random2T3 + "\nNumber 3 = " + random3T3);

        // Lowest Number
        if(random1T3 < random2T3 && random1T3 < random3T3){
            System.out.println("Lowest number is = " + random1T3);
        }
        else if(random2T3 < random1T3 && random2T3 < random3T3){
            System.out.println("Lowest number is = " + random2T3);
        }
        else System.out.println("Lowest number is = " + random3T3);

        // Middle Number
        if(random1T3 > random2T3 && random1T3 < random3T3 || random1T3 > random3T3 &&
        random1T3 < random2T3){
            System.out.println("Middle number is = " + random1T3);
        }
        else if(random2T3 > random1T3 && random2T3 < random3T3 || random2T3 > random3T3 && random2T3 < random1T3){
            System.out.println("Middle number is = " + random2T3);
        }
        else System.out.println("Middle number is = " + random3T3);

        // Greatest Number
        if(random1T3 > random2T3 && random1T3 > random3T3){
            System.out.println("Greatest number is = " + random1T3);
        }
        else if(random2T3 > random1T3 && random2T3 > random3T3){
            System.out.println("Greatest number is = " + random2T3);
        }
        else System.out.println("Greatest number is = " + random3T3);

        System.out.println();


        /*
        ---------------TASK 4---------------

        PSEUDO - CODE:
        1. Create char variables
        2. Cast them into an Int variable
        3. Create if - else statements
        4. Print out result
         */

        System.out.println("--------------- TASK 4 ---------------");

        char c1 = '5', c2 = 'D', c3 = 'R';
        int c1Int = c1, c2Int = c2, c3Int = c3;

        System.out.println("Characters are " + c1 + ", " + c2 + ", " + c3);

        // Character 1
        if(c1Int >= 65 && c1Int <= 90){
            System.out.println("The letter is Uppercase");
        }
        else if(c1Int >= 97 && c1Int <= 122){
            System.out.println("The letter is Lowercase");
        }
        else System.out.println("Invalid Character detected!!!");

        // Character 2
        if(c2Int >= 65 && c2Int <= 90){
            System.out.println("The letter is Uppercase");
        }
        else if(c2Int >= 97 && c2Int <= 122){
            System.out.println("The letter is Lowercase");
        }
        else System.out.println("Invalid Character detected!!!");

        // Character 3
        if(c3Int >= 65 && c3Int <= 90){
            System.out.println("The letter is Uppercase");
        }
        else if(c3Int >= 97 && c3Int <= 122){
            System.out.println("The letter is Lowercase");
        }
        else System.out.println("Invalid Character Detected!!!");

        System.out.println();


        /*
        ---------------TASK 5---------------

        PSEUDO - CODE:
        1. Create char variable
        2. Cast into Int
        3. Create if - else statements
        4. Print out results
         */

        System.out.println("--------------- TASK 5 ---------------");

        char t5_c = 'a';
        int t5_cInt = t5_c;

        System.out.println("Character is \"" + t5_c + "\"");

        if(t5_cInt == 65 || t5_cInt == 97 || t5_cInt == 69 || t5_cInt == 101 || t5_cInt == 73 ||
                t5_cInt == 105 || t5_cInt == 79 || t5_cInt == 111 || t5_cInt == 85 || t5_cInt == 117){
            System.out.println("The letter is a vowel");
        }
        else if(t5_cInt >= 65 && t5_cInt <= 90 || t5_cInt >= 97 && t5_cInt <= 122){
        System.out.println("The letter is a consonant");
        }
        else System.out.println("Invalid Character Detected!!!");

        System.out.println();


        /*
        ---------------TASK 6---------------

        PSEUDO - CODE:
        1. Create char variable and cast to int
        2. Create if - else statements
        3. Print results
         */

        System.out.println("--------------- TASK 6 ---------------");

        char c4 = '5';
        int t6_c = c4;

        System.out.println("Character is \"" + c4 + "\"");

        if(t6_c >= 32 && t6_c <= 47 || t6_c >= 58 && t6_c <= 64 || t6_c >= 91 && t6_c <= 96 || t6_c >= 123 && t6_c <= 126){
            System.out.println("Special Character is = " + c4);
        }
        else System.out.println("Invalid Character Detected!!!");

        System.out.println();


        /*
        ---------------TASK 7---------------

        PSEUDO - CODE:
        1. Create char variable and cast to Int
        2. Create if - else statements
        3. Print results
         */

        System.out.println("--------------- TASK 7 ---------------");

        char c7 = '$';
        int t7_c = c7;

        System.out.println("Character is \"" + c7 + "\"");

        if(t7_c >= 65 && t7_c <= 90 || t7_c >= 97 && t7_c <= 122){
            System.out.println("Character is a letter");
        }
        else if(t7_c >= 32 && t7_c <= 47 || t7_c >= 58 && t7_c <= 64 || t7_c >= 91 && t7_c <= 96 || t7_c >= 123 && t7_c <= 126){
            System.out.println("Character is a special character");
        }
        else if(t7_c >= 48 && t7_c <= 57) System.out.println("Character is a digit");

        System.out.println("\nEnd Of Program!");
    }
}




















