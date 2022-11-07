package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void demo(){
        System.out.println("hello");
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest(){
        System.out.println("Bye");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("I will execute last");
    }
}
