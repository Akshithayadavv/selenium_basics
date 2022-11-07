package tests;

import org.testng.annotations.*;

public class Day3 {

    @Test(dataProvider = "getData")
    public void webLoginCarLoan(String username, String password){

        System.out.println("weblogincar");
        System.out.println(username);
        System.out.println(password);
    }

   @Parameters({"URL"})
    @Test
    public void mobileLoginCarLoan(String urlname){
        System.out.println("mobilelogincar");
        System.out.println(urlname);

    }
    @AfterMethod
    public void afterEvery(){
        System.out.println("I will execute after every test method in day3 class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After executing all methods in the class");
    }
    @BeforeSuite
    public void bfSuit(){
        System.out.println("I am first before suite");
    }
    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[3][2];

        data[0][0]="fistusername";
        data[0][1]="password";

        data[1][0]="secondusername";
        data[1][1]="secondpassword";

        data[2][0]="thirdusername";
        data[2][1]="thirdpassword";

        return data;
    }
}
