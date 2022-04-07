package learningObjects;

public class PrintOutPractice {
    public static void main(String[] args){

        char h = 'H';
        char e = 'e';
        char l = 'l';
        char o = 'o';

        System.out.print(h);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);

        String greetings = "Hello";

        System.out.println("\n" + greetings);

        String tech = "Tech";
        String global = "Global";

        String schoolName1 = tech + global;             //+ operator
        String schoolName2 = tech.concat(global);       //concat method

        System.out.println(schoolName1 + "\n" + schoolName2);

    }
}
