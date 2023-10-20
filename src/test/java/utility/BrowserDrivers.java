package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDrivers {
    public static WebDriver driver;

    public BrowserDrivers(){
        this.driver = driver;
        System.setProperty("webdriver.firefox.driver" ,
                System.getProperty("user.dir") + "src/test/resources/drivers/geckodriver");
        this.driver = new FirefoxDriver();
    }

    public void close(){
        this.driver.close();
    }


}
