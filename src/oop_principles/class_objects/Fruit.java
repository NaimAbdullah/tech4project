package oop_principles.class_objects;

public class Fruit {

    //Instance variables
    public static boolean hasColor;
    public String name;
    public String shape;
    public boolean isSweet;

    static{
        System.out.println("This is static block");
        hasColor = true;
    }

    {
        System.out.println("This is instance block");
        shape = "Round";
        isSweet = true;
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        System.out.println(Fruit.hasColor);
        System.out.println(fruit1.name);
        System.out.println(fruit1.shape);
        System.out.println(fruit1.isSweet);
    }
}
