import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by mesa1 on 21/09/2017.
 */
public class TradeMeHomePage {
    public static String baseURL = "https://www.trademe.co.nz";

    public static WebElement MainSearchBar(WebDriver driver){
        return driver.findElement(By.id("searchString"));

    }

    public static void ReturnHome(WebDriver driver){
        WebElement homeButton = driver.findElement(By.id("SiteHeader_SiteTabs_kevin"));
        homeButton.click();
    }

    public static void Inputter(WebElement Element, String thingToSay){
        Element.sendKeys(thingToSay);
    }
}
