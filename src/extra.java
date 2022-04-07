import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class extra {
    public static void main(String[] args) {

        List<String> sunset = new ArrayList<>();
        sunset.add("Today the students eat at 7:18!");
        sunset.add("Today the students eat at 7:19!");
        sunset.add("Today the students eat at 7:20!");
        sunset.add("Today the students eat at 7:21!");
        sunset.add("Today the students eat at 7:22!");
        sunset.add("Today the students eat at 7:23!");
        sunset.add("Today the students eat at 7:25!");
        sunset.add("Today the students eat at 7:26!");
        sunset.add("Today the students eat at 7:27!");
        sunset.add("Today the students eat at 7:28!");
        sunset.add("Today the students eat at 7:29!");
        sunset.add("Today the students eat at 7:30!");
        sunset.add("Today the students eat at 7:31!");
        sunset.add("Today the students eat at 7:32!");
        sunset.add("Today the students eat at 7:33!");
        sunset.add("Today the students eat at 7:34!");
        sunset.add("Today the students eat at 7:35!");
        sunset.add("Today the students eat at 7:37!");
        sunset.add("Today the students eat at 7:38!");
        sunset.add("Today the students eat at 7:39!");
        sunset.add("Today the students eat at 7:40!");
        sunset.add("Today the students eat at 7:41!");
        sunset.add("Today the students eat at 7:42!");
        sunset.add("Today the students eat at 7:43!");
        sunset.add("Today the students eat at 7:44!");
        sunset.add("Today the students eat at 7:45!");
        sunset.add("Today the students eat at 7:46!");
        sunset.add("Today the students eat at 7:47!");
        sunset.add("Today the students eat at 7:48!");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what day is today");
        int date = input.nextInt();

        if(date == 1){
            System.out.println("LAST DAY OF RAMADAN! Students eat at 7:50!");
        }
        else System.out.println(sunset.get(date - 2));
    }
}
