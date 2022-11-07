import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://spicejet.com");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        int i=1;
        while (i<5) {

            driver.findElement(By.id("hrefIncAdt")).click();
            i++;}
        driver.findElement(By.id("btnclosepaxoption")).click();

    }
}
