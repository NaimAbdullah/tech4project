package casting;

public class ExerciseConvertingDataTypes {
    public static void main(String[] args) {

        /*
        Write a program which will take two numbers as a STRING and get the avg of them \
        and print it out

        Input:
        String num1 = "23";
        String num2 = "25";

        Output:
        24
         */

        String num1 = "23";
        String num2 = "25";

        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);

        System.out.println("The average is = " + (num1Int + num2Int) / 2);

        /*
            Assume David is going to save  $390 to buy a bicycle.
            David can save only $15.60 per day. How many days later,
            David can save $390 and buy the bicycle.

            Requirement:
            Write a java program to solve this problem given above

            Input:
            String save = 390;
            String day = 15.60;

            Expected Output:
            25
         */

        String save = "390";
        String day = "15.60";

        int saveInt = Integer.parseInt(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println("David needs to save for this many days = " + ((int) (saveInt / dayDouble)));
    }
}
