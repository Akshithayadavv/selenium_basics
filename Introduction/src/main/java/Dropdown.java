import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://spicejet.com");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='gl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
    }
}
