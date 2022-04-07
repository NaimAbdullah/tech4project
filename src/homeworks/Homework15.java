package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("\n--------------- TASK 1 ---------------\n");

        List<Integer> numbersT1 = new ArrayList<>();
        numbersT1.add(10);
        numbersT1.add(23);
        numbersT1.add(67);
        numbersT1.add(23);
        numbersT1.add(78);

        System.out.println(numbersT1.get(3));
        System.out.println(numbersT1.get(0));
        System.out.println(numbersT1);


        System.out.println("\n--------------- TASK 2 ---------------\n");

        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n--------------- TASK 3 ---------------\n");

        List<Integer> numbersT3 = new ArrayList<>();

        numbersT3.add(23);
        numbersT3.add(-34);
        numbersT3.add(-56);
        numbersT3.add(0);
        numbersT3.add(89);
        numbersT3.add(100);

        System.out.println(numbersT3);

        Object[] arrNum = numbersT3.toArray();
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));


        System.out.println("\n--------------- TASK 4 ---------------\n");

        List<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);

        Object[] arrCities = cities.toArray();
        Arrays.sort(arrCities);
        System.out.println(Arrays.toString(arrCities));


        System.out.println("\n--------------- TASK 5 ---------------\n");

        List<String> marvelChar = new ArrayList<>();

        marvelChar.add("Spider Man");
        marvelChar.add("Iron Man");
        marvelChar.add("Black Panther");
        marvelChar.add("Deadpool");
        marvelChar.add("Captain America");

        System.out.println(marvelChar);

        System.out.println(marvelChar.contains("Wolverine"));


        System.out.println("\n--------------- TASK 6 ---------------\n");

        List<String> avengerChar = new ArrayList<>();

        avengerChar.add("Hulk");
        avengerChar.add("Black Widow");
        avengerChar.add("Captain America");
        avengerChar.add("Iron Man");

        Object[] arrAvenger = avengerChar.toArray();

        Arrays.sort(arrAvenger);
        System.out.println(Arrays.toString(arrAvenger));

        System.out.println(avengerChar.contains("Hulk") && avengerChar.contains("Iron Man"));


        System.out.println("\n--------------- TASK 7 ---------------\n");

        List<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('x');
        chars.add('$');
        chars.add('%');
        chars.add('9');
        chars.add('*');
        chars.add('+');
        chars.add('F');
        chars.add('G');

        System.out.println(chars);

        for (Character x : chars) {
            System.out.println(x);
        }


        System.out.println("\n--------------- TASK 8 ---------------\n");

        List<String> objects = new ArrayList<>();

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);

        Object[] arrObject = objects.toArray();

        Arrays.sort(arrObject);
        System.out.println(Arrays.toString(arrObject));

        int mCount = 0;
        int aeCount = 0;

        for (String x : objects) {
            if(x.toLowerCase().startsWith("m")) mCount++;
            if(!x.toLowerCase().contains("a") && !x.toLowerCase().contains("e")) aeCount++;
        }

        System.out.println(mCount);
        System.out.println(aeCount);


        System.out.println("\n--------------- TASK 9 ---------------\n");

        List<String> kitchenObjects = new ArrayList<>();

        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");

        System.out.println(kitchenObjects);

        int upperCount = 0;
        int lowerCount = 0;
        int containsP = 0;
        int startsEndsWithP = 0;

        for (String object : kitchenObjects) {
            if(Character.isUpperCase(object.charAt(0))) {
                upperCount++;
            }else lowerCount++;
            if(object.toLowerCase().contains("p")) containsP++;
            if(object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p")) startsEndsWithP++;
        }

        System.out.println("Elements starts with uppercase = " + upperCount);
        System.out.println("Elements starts with lowercase = " + lowerCount);
        System.out.println("Elements having P or p = " + containsP);
        System.out.println("Elements starting or ending with P or p = " + startsEndsWithP);


        System.out.println("\n--------------- TASK 10 ---------------\n");

        List<Integer> numbersT10 = new ArrayList<>();

        numbersT10.add(3);
        numbersT10.add(5);
        numbersT10.add(7);
        numbersT10.add(10);
        numbersT10.add(0);
        numbersT10.add(20);
        numbersT10.add(17);
        numbersT10.add(10);
        numbersT10.add(23);
        numbersT10.add(56);
        numbersT10.add(78);

        System.out.println(numbersT10);

        int divided10 = 0;
        int greater15 = 0;
        int less20 = 0;
        int less15Greater50 = 0;

        for (Integer number : numbersT10) {
            if(number % 10 == 0) divided10++;
            if(number % 2 == 0 && number > 15) greater15++;
            if(number % 2 != 0 && number < 20) less20++;
            if(number < 15 || number > 50) less15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + divided10);
        System.out.println("Elements that are even and greater than 15 = " + greater15);
        System.out.println("Elements that are odd and less than 20 = " + less20);
        System.out.println("Elements that are less than 15 and greater than 50 = " + less15Greater50);

        System.out.println("\nEnd of Program!!");
    }
}
