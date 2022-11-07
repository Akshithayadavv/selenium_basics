import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class FunctionalTesting {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/akshiy/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        Thread.sleep(3000);
        //driver.findElements(By.cssSelector("h4.product-name"));
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        Thread.sleep(5000);

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

        }


    public static void addItems(WebDriver driver, String[] itemsNeeded){
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<products.size();i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            //convert array into arraylist for easy search
            List itemsNeededList = Arrays.asList(itemsNeeded);
            int j = 0;
            if (itemsNeededList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == 3)
                    break;

            }
        }}}