package exceptions;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class FinallyBlock {
    public static void main(String[] args) {

            try {
                ArrayList<String> objects = new ArrayList<>();
                objects.add("Computer");
                objects.add("Mouse");
                objects.add("MousePad");

                for (String object : objects) {
                    objects.remove(object);
                }
            }finally {
                System.out.println("Here is the report!!");
            }
    }
}
