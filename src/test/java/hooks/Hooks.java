package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before Scenario");

    }
    @After
    public void tearDown(){
        System.out.println("After Scenario");

    }
    @Before("@First")
    public void beforeFirst(){
        System.out.println("Before Tag First");

    }
    @After("@First")
    public void afterFirst(){
        System.out.println("After Tag First");

    }
    @Before("@Second")
    public void beforeSecond(){
        System.out.println("Before Tag Second");

    }
    @After("@Second")
    public void afterSecond(){
        System.out.println("After Tag Second");

    }

}
