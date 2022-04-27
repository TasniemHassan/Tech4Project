package singleton;

public class Driver {
    /*
    Preventing a class from being instantiated more than once
    How to achieve singleton
    1. make constructor private
    2. Create an instance variable of the object of Driver
    3. make this variable static and provide a static getDriver method
    4. Provide a if condition to initialize the Driver instance variables
    if it is null, then initialize it
    if it is not null, then return the driver which has been already initialized

    NOTE: we understand that the single Driver object is also encapsulated
     */

   private static Driver driver;
    private Driver(){

    }

    public static Driver getDriver() {
       if(driver == null) driver = new Driver();
        return driver;
    }
}
