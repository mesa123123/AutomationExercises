
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.security.KeyStore;

import static java.lang.Boolean.TRUE;


/**
 * Created by mesa1 on 6/09/2017.
 */
public class DriveCarDrive {
    private static final BrowserType browserInTest = BrowserType.CHROME;
    private static final String Browser = "chromedriver";
    private static final String carMake = "Audi";
    private static final String carType = "RS4";
    private static final boolean used = true;


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        BrowserLaunch launcher = new BrowserLaunch(browserInTest);
        WebDriver Driver = BrowserLaunch.getBrowser();
        Driver.manage().window().maximize();
        Driver.get(TradeMeHomePage.baseURL);
        Driver.quit();
    }
}
