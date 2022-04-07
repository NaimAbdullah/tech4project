package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Project05 {
    public static void main(String[] args) {


        System.out.println("--------------- TASK 1 ---------------");

        System.out.print("Please enter a string");
        String s1 = ScannerHelper.getAStringFromUser();

        if(s1.length() >= 8){
            String s1First = s1.substring(0, 4);
            String s1Last = s1.substring(s1.length() - 4);
            System.out.println(s1Last + s1.substring(4, s1.length() - 4) + s1First);
        }
        else System.out.println("This String does not have 8 characters");

        System.out.println();


        System.out.println("--------------- TASK 2 ---------------");

        System.out.print("Please enter a sentence");
        String s2 = ScannerHelper.getAStringFromUser();

        if(s2.trim().contains(" ")){
            String firstWord = s2.substring(0, s2.indexOf(' '));
            String middle = s2.substring(s2.indexOf(' '), s2.lastIndexOf(' ') + 1);
            String lastWord = s2.substring(s2.lastIndexOf(' ') + 1);
            System.out.println(lastWord + middle + firstWord);
        }
        else System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println();


        System.out.println("--------------- TASK 3 ---------------");

        String str1 = "I had some stupid t-shirts in the past and also some idiot look shoes";
//        String str2 = "I like idiot behaviors";
//        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        if(str1.contains("stupid") || str1.contains("idiot")){
            System.out.println(str1.replace("stupid", "nice").replace("idiot", "nice"));
        }
        else System.out.println(str1);

        System.out.println();


        System.out.println("--------------- TASK 4 ---------------");

        String name = ScannerHelper.getANameFromUser();
        String middle = StringHelper.getMiddle(name);

        if(name.length() > 2) System.out.println(middle);
        else System.out.println("Invalid input!!!");

        System.out.println();

        System.out.println("--------------- TASK 5 ---------------");

        System.out.print("Please enter a country");
        String country = ScannerHelper.getAStringFromUser();

        if(country.length() > 5){
            System.out.println(country.substring(2, country.length() - 2));
        }
        else System.out.println("Invalid input!!!");

        System.out.println();


        System.out.println("--------------- TASK 6 ---------------");

        String address = ScannerHelper.getAnAddressFromUser();

        System.out.println(address.replace('a', '*').replace('e', '#')
                .replace('i', '+').replace('u', '$').replace('o', '@')
                .replace('A', '*').replace('E', '#').replace('I', '+')
                .replace('U', '$').replace('O', '@'));

        System.out.println();


        System.out.println("--------------- TASK 7 ---------------");

        int num1 = RandomNumberGenerator.getRandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getRandomNumber(0, 25);

        System.out.println("First random number is = " + num1);
        System.out.println("First random number is = " + num2);

        for(int i = num1; i <= num2; i++) {
            if(i % 5 != 0){
                System.out.println(i);
            }
        }

        for(int i = num2; i <= num1; i++){
            if(i % 5 != 0){
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("END OF PROGRAM!");
    }
}
