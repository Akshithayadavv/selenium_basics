package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

    @Parameters({"URL"})
    @Test
    public void webLoginHomeLoan(String uname){

        System.out.println("webloginhome");
        System.out.println(uname);

    }

    @Test
    public void mobileLoginHomeLoan(){
        System.out.println("mobileloginhome");

    }
}
