package homeworks;

public class Homework21 {

    // Task - 1
    public static void fizzBuzz1(int a){
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }


    // Task - 2
    public static String fizzBuzz2(int a){
        if (a % 3 == 0 && a % 5 == 0) return "FizzBuzz";
        else if (a % 5 == 0) return "Buzz";
        else if (a % 3 == 0) return "Fizz";
        return String.valueOf(a);
    }


    // Task - 3
    public static int findSumNumbers(String str){
        int sum = 0;

        for (String element : str.split("[^0-9]")) {
            if (!element.isEmpty()) sum += Integer.parseInt(element);
        }
        return sum;
    }


    // Task - 4
    public static int findBiggestNumber(String str){
        int largestNumber = 0;
        String[] arr = str.split("[^0-9]");

        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].isEmpty() && Integer.parseInt(arr[i]) > largestNumber) largestNumber = Integer.parseInt(arr[i]);
        }
        return largestNumber;
    }


    // Task - 5
    public static String countSequenceOfCharacters(String str) {
        String sequence = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!sequence.contains(str.charAt(i) + "")) {
                sequence += str.charAt(i);
                sequence += count;
                count = 1;
            }
        }
        return sequence;
    }

    public static void main(String[] args) {
        fizzBuzz1(15);
        System.out.println(fizzBuzz2(15));
        System.out.println(findSumNumbers("ab110 c045d%"));
        System.out.println(findBiggestNumber("avs#$"));
        System.out.println(countSequenceOfCharacters("aaAAa"));
    }
}
