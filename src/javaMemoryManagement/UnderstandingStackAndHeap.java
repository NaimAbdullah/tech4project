package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age); // 45


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.age = 2;

        System.out.println(dog1);
    }
}
