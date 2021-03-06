package oop_principles.class_objects;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "male";
        student1.address = "Chicago";
        student1.weight = 170.5;
        student1.height = 5.7;
        student1.email = "johndoe@gmail.com";
        student1.id = 1001;

        System.out.println(student1);
        System.out.println();

        Student student2 = new Student();

        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 1002;

        System.out.println(student2);
        System.out.println();

        Student student3 = new Student();

        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2002";
        student3.gender = "male";
        student3.address = "Chicago";
        student3.weight = 165;
        student3.height = 5.5;
        student3.email = "alex@gmail.com";
        student3.id = 1003;

        System.out.println(student3);
        System.out.println();

        Student student4 = new Student();

        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender = "female";
        student4.address = "Miami";
        student4.weight = 160;
        student4.height = 5.7;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;

        System.out.println(student4);
        System.out.println();

        Student student5 = new Student();

        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender = "female";
        student5.address = "Berlin";
        student5.weight = 150;
        student5.height = 5.3;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;

        System.out.println(student5);
        System.out.println();

        /*
        TASK-1
        Count how many students are from Chicago

        EXPECTED:
        2
         */

        System.out.println("\n--------Task-1---------\n");

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int count = 0;

        for (Student student : students) {
            if(student.address.equalsIgnoreCase("Chicago")){
                count++;
            }
        }

        System.out.println(count);


        System.out.println("\n--------Task-2---------\n");

        int maleCount = 0;
        int femaleCount = 0;

        for (Student student : students) {
            if(student.gender.equalsIgnoreCase("male")){
                maleCount++;
            }
            else femaleCount++;
        }

        System.out.println("Male = " + maleCount);
        System.out.println("Female = " + femaleCount);


        System.out.println("\n--------Task-3---------\n");

        int teenCount = 0;

        for (Student student : students) {
            if(student.age >= 13 && student.age <= 19) teenCount++;
        }
        System.out.println(teenCount);


        System.out.println("\n--------Task-4---------\n");

        for (Student student : students) {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.dateOfBirth);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.height);
            System.out.println(student.email);
            System.out.println(student.id);
            System.out.println("----------");
        }

    }
}
