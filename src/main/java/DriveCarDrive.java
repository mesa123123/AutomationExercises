
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mesa1 on 6/09/2017.
 */
public class DriveCarDrive {
    private static final BrowserType browserInTest = BrowserType.EDGE;
    private static final String Browser = "Edge";
    private static final String DriverLocation = "src\\main\\resources\\"+ Browser +".exe";
    private static final String baseURL = "https://www.trademe.co.nz";
    private static final String carMake = "Audi";
    private static final String carType = "RS4";


    public static void main(String[] args) throws InterruptedException {
        BrowserLaunch launcher = new BrowserLaunch(browserInTest, DriverLocation);
        WebDriver Driver = BrowserLaunch.getBrowser();
        Driver.manage().window().maximize();
        Driver.get(baseURL);
        WebElement searchBar = new WebDriverWait(Driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("searchString")));;
        searchBar.click();
        System.out.print("Ping");
        searchBar.sendKeys("Best " + carMake + " " + carType);
        searchBar.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        Driver.quit();
    }
}
