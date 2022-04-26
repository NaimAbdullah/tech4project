package singleton;

public class Driver {

    /*
    How to achieve singleton
    1. make constructor private
    2. create an instance variable of the object of Driver
     */

    private static Driver driver; // declared

    private Driver(){

    }

    public static Driver getDriver() {
        if(driver == null) driver = new Driver();
        return driver;
    }
}