package oop_principles.class_objects;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1); // oop_principles.class_objects.Car@1540e19d

        System.out.println(car1.getClass().getName()); // oop_principles.class_objects.Car

        car1.make = "Tesla";
        car1.model = "S";
        car1.year = 2022;
        car1.color = "Red";

        System.out.println(car1.make);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.model);

        System.out.println();

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2018;
        car2.color = "Red";

        System.out.println(car2.make);
        System.out.println(car2.color);
        System.out.println(car2.year);
        System.out.println(car2.model);

        System.out.println(car1);

    }
}
