import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

    public static void main(String[] args) throws InterruptedException {

       String text="Akshitha";
        System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
}}
