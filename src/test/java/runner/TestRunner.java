package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestRunner {

    @Test
    void clickAndHold() throws InterruptedException {
        System.setProperty("webdriver.firefox.driver" ,
                System.getProperty("user.dir") + "src/test/resources/drivers/geckodriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));
        WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", titleC);
        actions.moveToElement(titleA).build().perform();
        actions.clickAndHold().build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
