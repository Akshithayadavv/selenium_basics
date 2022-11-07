package scope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BrokenLinks {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
         HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
         conn.setRequestMethod("HEAD");
         conn.connect();
         int respCode=conn.getResponseCode();
         System.out.println(respCode);
    }
}
