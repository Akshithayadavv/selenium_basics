import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
       // driver.close();


    }
}
