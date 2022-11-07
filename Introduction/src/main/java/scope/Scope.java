package scope;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        //webdriver scope
        WebElement footerDriver= driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(5000L);}
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();

            while(it.hasNext()){

                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());



        }

    }
}
