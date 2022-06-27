package homeworks;

import java.util.*;

public class Homework23 {

    // Task - 1
    public static TreeMap<Integer, String> parseData(String str){
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        List<String> list = Arrays.asList(str.split("[{]"));
        for (int i = 1; i < list.size(); i++) {
            String[] arr = list.get(i).split("[}]");
            sortedMap.put(Integer.parseInt(arr[0]), arr[1]);
        }
        return sortedMap;
    }


    //Task - 2
    public static double calculateTotalPrice1(Map<String, Integer> cart){
        double totalPrice = 0, apple = 2.00, orange = 3.29, mango = 4.99, pineapple = 5.25;

        if(cart.containsKey("Apple")) totalPrice += cart.get("Apple") * apple;
        if (cart.containsKey("Orange")) totalPrice += cart.get("Orange") * orange;
        if (cart.containsKey("Mango")) totalPrice += cart.get("Mango") * mango;
        if (cart.containsKey("Pineapple")) totalPrice += cart.get("Pineapple") * pineapple;

        return totalPrice;
    }

    //Task - 3
    public static double calculateTotalPrice2(Map<String, Integer> cart){
        double totalPrice = 0, apple = 2.00, twoApples = 3.00, orange = 3.29, mango = 4.99, fourMangoes = 14.97;
        if (cart.containsKey("Apple")) {
            double apples = cart.get("Apple");
            if (apples % 2 == 0) totalPrice += (apples / 2) * twoApples;
            else totalPrice += ((apples - 1) / 2) * twoApples + apple;
        }
        if (cart.containsKey("Orange")) {
            double oranges = cart.get("Orange");
            totalPrice += oranges*orange;
        }
        if (cart.containsKey("Mango")) {
            double mangoes = cart.get("Mango"), extraMangoes = mangoes % 4;
            if (mangoes < 4) totalPrice += mangoes * mango;
            else{
                if(mangoes % 4 == 0) totalPrice += (mangoes / 4) * fourMangoes;
                else totalPrice += ((mangoes-extraMangoes) / 4) * fourMangoes + (extraMangoes * mango);
            }
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        System.out.println("\n----Task 1----");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n----Task 2----");
        HashMap<String, Integer> shop = new HashMap<>();
        shop.put("Apple", 3);
        shop.put("Mango", 5);

        System.out.println(calculateTotalPrice1(shop));

        System.out.println("\n----Task 3----");
        System.out.println(calculateTotalPrice2(shop));
    }
}
