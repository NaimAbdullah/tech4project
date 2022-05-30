package projects;

import utilities.CharacterHelper;
import java.util.ArrayList;

public class Project08 {

    // Task - 1
    public static int countMultipleWords(String[] words){
        int count = 0;
        for (String element : words) {
            if(element.trim().contains(" "))count++;
        }
        return count;
    }


    // Task - 2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        numbers.removeIf(integer -> integer < 0);
        return numbers;
    }


    // Task - 3
    public static boolean validatePassword(String password){
        boolean containsDigit = false, containsUpper = false, containsLower = false, containsSpecial = false, noSpace = false;

        if(password.length() >= 8 && password.length() <= 16)
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if(Character.isDigit(c) && !containsDigit) containsDigit = true;
                if(Character.isUpperCase(c) && !containsUpper) containsUpper = true;
                if(Character.isLowerCase(c) && !containsLower) containsLower = true;
                if(CharacterHelper.isSpecial(c) && !containsSpecial) containsSpecial = true;
                if(c != ' ') noSpace = true;
            }
         return (containsDigit && containsUpper && containsLower && containsSpecial && noSpace);
    }


    // Task - 4
    public static boolean validateEmailAddress(String email){

        boolean validity = false;
        int atCounter = 0;

        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@') atCounter++;
        }
        int atIndex = email.indexOf('@'), dotIndex = email.lastIndexOf('.');
        if(!email.contains(" ") && atCounter == 1){
            if(email.substring(0, atIndex).length() >= 2 && email.substring(atIndex + 1, dotIndex).length() >= 2 &&
            email.substring(dotIndex + 1).length() >= 2) validity = true;
        }
        return validity;
    }

    public static void main(String[] args) {
        System.out.println(validatePassword("He@ll1 edd"));
    }
}
