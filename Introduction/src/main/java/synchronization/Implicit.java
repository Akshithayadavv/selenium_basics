package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Implicit {


        public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
            WebDriver driver= new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.findElement(By.id("autosuggest")).sendKeys("ind");
            Thread.sleep(3000);
            List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

            for(WebElement option:options){
                if(option.getText().equalsIgnoreCase("India"))
                {
                    option.click();
                    break;}
            }
        }
    }


