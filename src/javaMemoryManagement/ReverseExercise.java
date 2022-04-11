package javaMemoryManagement;

public class ReverseExercise {

        /*
        Write a method that takes a String and returns it reversed
         */

        public static String reverse1(String s){
            String r = "";
            for (int i = s.length()-1; i >= 0; i--) {
                r += s.charAt(i);
            }
            return r;
        }

        public static String reverse2(String str){
            return new StringBuilder(str).reverse().toString();
        }

        /*
        Create a method that takes a String and checks if it is palindrome
         */

        public static boolean isPalindrome(String s){
            return s.equals(new StringBuilder(s).reverse().toString());
        }

    public static void main(String[] args) {

        System.out.println(reverse1("Hello"));
        System.out.println(reverse1("World"));

        System.out.println(reverse2("Civic"));
        System.out.println(reverse2("John"));
        System.out.println(reverse2("Naim"));

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("123321"));
        System.out.println(isPalindrome("madaM"));
    }
}
