package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise01 {
    /*
    TASK
        Create a new txt file called objects
        Write below data in it
            Computer
            Phone
            Table
            Chair
            Mouse
            Screen
            Remote
        Print objects that has r or R as a letter
        EXPECTED OUTPUT
        Computer
        Chair
        Screen
        Remote
     */

    public static void main(String[] args) {

        File myFile = new File("objects.txt");

        try {
            FileWriter fileWriter = new FileWriter("objects.txt");
            fileWriter.write("Computer\n");
            fileWriter.write("Phone\n");
            fileWriter.write("Table\n");
            fileWriter.write("Chair\n");
            fileWriter.write("Mouse\n");
            fileWriter.write("Screen\n");
            fileWriter.write("Remote");
            fileWriter.close();

            Scanner scanner = new Scanner(myFile);

            while(scanner.hasNextLine()){
                String next = scanner.nextLine();
                if(next.toLowerCase().contains("r")) System.out.println(next);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            myFile.delete();
        }

        System.out.println("End of program!");
    }
}
