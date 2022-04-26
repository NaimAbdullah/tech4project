package singleton;

public class Test {
    public static void main(String[] args) {

        /*
        Not possible anymore because constructor is private

        Driver d1 = new Driver();
        Driver d2 = new Driver();

        System.out.println(d1);
        System.out.println(d2);
         */
        System.out.println(Driver.getDriver()); // singleton.Driver@1540e19d
        System.out.println(Driver.getDriver()); // singleton.Driver@677327b6
        System.out.println(Driver.getDriver()); // singleton.Driver@14ae5a5
    }
}
