package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        String[] colors = {"red", "blue", "yellow", "white"};

        String longestword = "";

        for (String color : colors) {
            if(color.length() > longestword.length()){
                longestword = color;
            }
        }
        System.out.println(longestword);
    }
}
