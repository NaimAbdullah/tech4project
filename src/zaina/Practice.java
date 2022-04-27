package zaina;

public class Practice {
    public static void main(String[] args) {

        String str = "Ahmad";

        String str1 = "Naim";

        System.out.println(str + str1);

        StringBuilder name = new StringBuilder("Ahmad");
        StringBuffer name2 = new StringBuffer("Naim");

        name.insert(1, 'c');
        System.out.println(name);

        System.out.println(name2);
        name2.toString();
        System.out.println(name2);


    }
}
